
function handleOnChange(e) {
	var value = e.value;
	if (value == 'byTime') {
		$('#startDate').attr('type', 'text');
		$('#startDate').attr('placeholder', ' \'-\'를 써주세요.');
		$('#startDate').val('');
		$('#endDate').attr('type', 'text');
		$('#endDate').attr('placeholder', ' \'-\'를 써주세요.');
		$('#endDate').val('');
		$('button[name="viewBtn"]').attr('onclick', 'viewByTime()')
	} else if (value == 'byDay') {
		$('#startDate').attr('type', 'date');
		$('#endDate').attr('type', 'date');
		$('button[name="viewBtn"]').attr('onclick', 'viewByDate()')
	} else if (value == 'byMonth') {
		$('#startDate').attr('type', 'month');
		$('#endDate').attr('type', 'month');
		$('button[name="viewBtn"]').attr('onclick', 'viewByDate()')
	} else if (value == 'byYear') {
		$('#startDate').attr('type', 'text');
		$('#startDate').attr('placeholder', '\'YYYY\' 형식으로 입력');
		$('#startDate').val('');
		$('#endDate').attr('type', 'text');
		$('#endDate').attr('placeholder', '\'YYYY\' 형식으로 입력');
		$('#endDate').val('');
		$('button[name="viewBtn"]').attr('onclick', 'viewByDate()')
	}

}