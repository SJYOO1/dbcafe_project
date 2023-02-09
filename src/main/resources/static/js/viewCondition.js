$(function() {

	$('#normalView').click(function() {
		$('.viewSelect').empty();
		$('.viewSelect').append('조회조건 : ');
		$('.viewSelect').append('<select name="selectBoxNormal" id="selectBoxNormal" onchange="handleOnChangeNormal(this)">');
		$('.viewSelect').append('</select>');
		$('#selectBoxNormal').append('<option value="">선택하세요</option>');
		$('#selectBoxNormal').append('<option id="byTime" value="byTime">시간별조회</option>');
		$('#selectBoxNormal').append('<option id="byDay" value="byDay">일별조회</option>');
		$('#selectBoxNormal').append('<option id="byMonth" value="byMonth">월별조회</option>');
		$('#selectBoxNormal').append('<option id="byYear" value="byYear">연별조회</option>');
	});


	$('#compareView').click(function() {
		$('.viewSelect').empty();
		$('.viewSelect').append('조회조건 : ');
		$('.viewSelect').append('<select name="selectBoxCompare" id="selectBoxCompare" onchange="handleOnChangeCompare(this)">');
		$('.viewSelect').append('</select>');
		$('#selectBoxCompare').append('<option value="">선택하세요</option>');
		$('#selectBoxCompare').append('<option id="byDay" value="byDay">일별조회</option>');
		$('#selectBoxCompare').append('<option id="byMonth" value="byMonth">월별조회</option>');
		$('#selectBoxCompare').append('<option id="byYear" value="byYear">연별조회</option>');
	});
});
function handleOnChangeNormal(e) {
	var value = e.value;
	if (value == 'byTime') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="text" id="startDate" name="startDate" placeholder="" value="" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="text" id="endDate" name="endDate" value="" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byTimeBtn">조회</button>');
	} else if (value == 'byDay') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="date" id="startDate" name="startDate" value="2020-03-05" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="date" id="endDate" name="endDate" value="2020-03-10" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byDateBtn">조회</button>');
	} else if (value == 'byMonth') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="month" id="startDate" name="startDate" value="2020-03" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="month" id="endDate" name="endDate" value="2020-04" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byDateBtn">조회</button>');
	} else if (value == 'byYear') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="text" id="startDate" name="startDate" placeholder="\'YYYY\' 형식 입력" value="" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="text" id="endDate" name="endDate" placeholder="\'YYYY\' 형식 입력" value="" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byDateBtn">조회</button>');
	}
}
function handleOnChangeCompare(e) {
	var value = e.value;
	if (value == 'byDay') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="date" id="startDate" name="startDate" value="2020-03-05" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="date" id="endDate" name="endDate" value="2020-03-10" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byDateBtn">조회</button>');
	} else if (value == 'byMonth') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="month" id="startDate" name="startDate" value="2020-03" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="month" id="endDate" name="endDate" value="2020-04" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byDateBtn">조회</button>');
	} else if (value == 'byYear') {
		$('.selectDate').empty();
		$('.selectDate').append('조회기간 : ');
		$('.selectDate').append('<input type="text" id="startDate" name="startDate" placeholder="\'YYYY\' 형식 입력" value="" />');
		$('.selectDate').append(' ~ ');
		$('.selectDate').append('<input type="text" id="endDate" name="endDate" placeholder="\'YYYY\' 형식 입력" value="" />');
		$('.selectStore').empty();
		$('.selectStore').append('조회매장 : ');
		$('.selectStore').append('<input type="checkbox" id="stNo1001" name="stNo" value="1001">여의도 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2001" name="stNo" value="2001">수원 ');
		$('.selectStore').append('<input type="checkbox" id="stNo2002" name="stNo" value="2002">용인');
		$('.viewButton').empty();
		$('.viewButton').append('<button id="byDateBtn">조회</button>');
	}
}