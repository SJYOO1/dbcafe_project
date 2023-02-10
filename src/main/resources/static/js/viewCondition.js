
function handleOnChange(e) {
	var value = e.value;
	if (value == 'byTime') {
		$('#startDate').attr('type', 'text');
		$('#startDate').attr('placeholder', ' \'-\'를 써주세요.');
		$('#endDate').attr('type', 'text');
		$('#endDate').attr('placeholder', ' \'-\'를 써주세요.');
		$('button[name="viewBtn"]').attr('id', 'byTimeBtn')
	} else if (value == 'byDay') {
		$('#startDate').attr('type', 'date');
		$('#endDate').attr('type', 'date');
		$('button[name="viewBtn"]').attr('id', 'byDateBtn')
	} else if (value == 'byMonth') {
		$('#startDate').attr('type', 'month');
		$('#endDate').attr('type', 'month');
		$('button[name="viewBtn"]').attr('id', 'byDateBtn')
	} else if (value == 'byYear') {
		$('#startDate').attr('type', 'text');
		$('#startDate').attr('placeholder', '\'YYYY\' 형식으로 입력');
		$('#endDate').attr('type', 'text');
		$('#endDate').attr('placeholder', '\'YYYY\' 형식으로 입력');
		$('button[name="viewBtn"]').attr('id', 'byDateBtn')
	}

}