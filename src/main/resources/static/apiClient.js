/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
apiClient = (function () {
    return{
        getCityInfo: function (name) {
            return app.getCityInfo(name, function (weather) {
                var lol
                console.log("yeiiii");
                console.log(weather[0]);
                console.log(weather[1]);
                if (weather != null) {
                    for (x = 0; x < weather.length; x++) {
                        var lol = "<tbody>" +
                                "<tr>" +
                                "<td>" + name + "</td>" +
                                "<td>" + weather[x].airportId + "</td>" +
                                '<td>' + weather[x].name + "</td>" +
                                '<td>' + weather[x].city + "</td>" +
                                '<td>' + weather[x].cityId + "</td>" +
                                '</tr>' + "</tbody>"
                        var btn = document.createElement("TR");
                        btn.innerHTML = lol;
                        document.getElementById("ApiTable").appendChild(btn);
                    }

                }


            });
        }
    }
})();