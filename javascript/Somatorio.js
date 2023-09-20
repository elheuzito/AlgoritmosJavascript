let Array = new Array(5);

Array = [1,5,7,9,5];
var somatorio = 0;

for(var i = 0 ; i < Array.length ; i++){
    somatorio += Array[i];
}

console.log(somatorio);