/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
apiClient=(function(){
	return{
		getCityInfo:function(name){
			return app.getCityInfo(name,function(weather){
				var data=$("#ApiTable");
				
				var data=JSON.parse(weather);
				console.log(data);
				data.append("<tbody>"+
						"<tr>"+
							"<td>"+name+"</td>"+
							"<td>"+data.airportId+"</td>"+
							'<td>'+data.name+"</td>"+
							'<td>'+data.city+"</td>"+
							'<td>'+data.cityId+"</td>"+
							'</tr>'+"</tbody>"
							
						);
			});
		}
	}
})();

