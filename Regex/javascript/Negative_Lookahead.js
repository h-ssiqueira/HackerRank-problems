var Regex_Pattern = /(.)(?!\1)/g;	//Do not delete `/` and `/g`.

function processData(Test_String) {
    //Enter your code here
    var Array = Test_String.match(Regex_Pattern);
    console.log("Number of matches :", Array.length);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});