/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

app=(function(){
	return {
		getCityInfo:function(name,callback){
			$.get("/maps/"+name,function(data){
				callback(data);
			});
		}
	}
	
})();