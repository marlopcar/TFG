// ... More code avobe ... //

	print() {
		this.originalTitle = window.document.title;
		this.curURL = window.location.href;
		history.replaceState(history.state, '', '/');
		window.print();
		history.replaceState(history.state, '', this.curURL);
		window.document.title = this.originalTitle;
	}
}