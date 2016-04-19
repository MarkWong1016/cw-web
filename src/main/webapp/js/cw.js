/**
 * 天下報到系統 common js
 * 
 * @author mark wong
 */

var t = 3;
function countDown() {
	$("#secSpan").html(t);
	if (t == 0) {
		window.close();
	}
	t = t - 1;
	setTimeout("countDown()", 1000);
}
function closeWindow() {
	var win = window.open("about:blank", "_self"); win.close();
}
