function processData(input) {
    var lines = input.split(/\r?\n/);
    var ipv4 = '^((2[0-5]{2}|1[0-9]{2}|[0-9]{1,2})\.){3}(2[0-5]{2}|1[0-9]{2}|[0-9]{1,2}){1}$'
    var ipv6 = '^([0-9abcdef]{1,4}:){7}[0-9abcdef]{1,4}$'
    var line = ""
    for(let i = 1; i <= lines[0]; i++){
        line = lines[i]
        if (line.match(ipv4))
            console.log('IPv4')
        else if (line.match(ipv6))
            console.log('IPv6')
        else
            console.log('Neither')
    }
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
