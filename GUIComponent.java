interface GUIComponent {
	
	 void onClick(int on);
						
	 void onCursorFocus (int f);
	
	 boolean move(int i,int j);
		
	 boolean move(Position p);
	 boolean move(Dimension d);
	
	 boolean resize(int x,int y);
}