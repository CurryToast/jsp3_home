document.getElementById('clear').addEventListener('click', () => { location.href = location.pathname; });
document.querySelectorAll('.list-header > li').forEach(el => {
	el.addEventListener('click', (e) => {
		const params = new URLSearchParams(location.search);

		if (!params.has('column')) {
			params.append('column', e.target.className);
			params.append('desc', 'true');
		} else if (params.get('column') != e.target.className) {
			params.set('column', e.target.className);
		}
		
		if (params.has('desc')) {
			params.delete('desc');
		} else {
			params.append('desc', 'true');
		}
		
		location.href = `${location.pathname}?${params.toString()}`;
	});
});