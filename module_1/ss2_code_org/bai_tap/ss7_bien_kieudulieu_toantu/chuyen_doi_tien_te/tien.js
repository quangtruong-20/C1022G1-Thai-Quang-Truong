function swap() {
   let amount = document.getElementById ('input').value ;
   let from = document.getElementById ('from').value ;
   let to = document.getElementById ('to').value ;
   let result;


   if ( from == 'USD' && to == 'VNĐ') {
      result = 'Result: ' + ( amount * 23000) + ' VNĐ';
   }
   else if (from == "VNĐ" && to == "USD") {
      result = 'Result: ' + ( amount / 23000) + ' $';
   }
   else if (from == "VNĐ"){
      result = 'Result: ' + amount + ' VNĐ';
   }
   else {
      result= 'Result: '+ amount + ' $';
   }

   document.getElementById("result").innerHTML = result;
}
