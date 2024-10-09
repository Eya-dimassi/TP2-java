package segment;

public class Madate {
	private int jours;
	private int mois;
	private int année;
	public String toString() {
		return (jours+"/"+mois+"/"+année);
	}
	public int getjours() {
		return jours;
	}
	public int getmois() {
		return mois;
	}
	public int getannée() {
		return année;
	}
	public void setjours(int jours) {
		this.jours=jours;
	}
	public void setmois(int mois) {
		this.mois=mois;
	}
	public void setannée(int année) {
		this.année=année;
	}

	public Madate (int jour,int mois,int année) {
		this.jours=jour;
		this.mois=mois;
		this.année=année;
		
	}
	public Madate(int année) {
		this.jours=1;
		this.mois=1;
		this.année=année;
	}
	void ajouterUnJour() {
		int x=30;
		if (mois==1||mois==3|| mois==5||mois==7||mois==8||mois==10||mois==12) {
			x=31;
		}
		else if (mois==2) {
			if(année % 4==0) {
				x=29;
			}else{
				x=28;
			}
		}
		jours++;
		if(jours>x) {
			année++;
			mois=1;
			jours=1;	
		}
		
		
	}
	void ajouterPluseursJours(int n) {
		for(int i=0;i<=n;i++) {
			ajouterUnJour();
		}
	}
	void ajouterUnMois() {
		mois++;
		if(mois>12) {
			mois=1;
			ajouterUnAn();
		}
	}
	void ajouterUnAn() {
		année++;
	}
	
		
	}
	
	  
  	
