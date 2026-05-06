// YOUR NAME:
// COLLABORATORS:
// LAST MODIFIED DATE: 
/*
Yearly Global Atmospheric CO₂ Levels (parts per million)
2001: 371.32 ppm
2002: 373.45 ppm
2003: 375.98 ppm
2004: 377.70 ppm
2005: 379.98 ppm
2006: 382.09 ppm
2007: 384.03 ppm
2008: 385.83 ppm
2009: 387.64 ppm
2010: 390.10 ppm
2011: 391.85 ppm
2012: 394.06 ppm
2013: 396.74 ppm
2014: 398.87 ppm
2015: 401.01 ppm
2016: 404.41 ppm
2017: 406.76 ppm
2018: 408.72 ppm
2019: 411.66 ppm
2020: 414.24 ppm
(Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
*/

class Main 
{
	//CONSTANTS SECTION

  public static void main(String[] args) 
  {
		// DECLARATION SECTION
    
       

		// INITIALIZATION SECTION
  double[] co2Levels = new double[20];

  co2Levels[0] = 371.32; //starting level in 2001
  co2Levels[1] = 373.45; //2002
  co2Levels[2] = 375.98; //2003
  co2Levels[3] = 377.70; //2004
  co2Levels[4] = 379.98; //2005
  co2Levels[5] = 382.09; //2006
  co2Levels[6] = 384.03; //2007
  co2Levels[7] = 385.83; //2008
  co2Levels[8] = 387.64; //2009
  co2Levels[9] = 390.10; //2010
  co2Levels[10] = 391.85; //2011
  co2Levels[11] = 394.06; //2012
  co2Levels[12] = 396.74; //2013
  co2Levels[13] = 398.87; //2014
  co2Levels[14] = 401.01; //2015
  co2Levels[15] = 404.41; //2016
  co2Levels[16] = 406.76; //2017
  co2Levels[17] = 408.72; //2018
  co2Levels[18] = 411.66; //2019
  co2Levels[19] = 414.24; //2020

  int [] year = new int[20];
  year[0] = 2001;
  year[1] = 2002;
  year[2] = 2003;
  year[3] = 2004;
  year[4] = 2005;
  year[5] = 2006;
  year[6] = 2007;
  year[7] = 2008;
  year[8] = 2009;
  year[9] = 2010;
  year[10] = 2011;
  year[11] = 2012;
  year[12] = 2013;
  year[13] = 2014;
  year[14] = 2015;
  year[15] = 2016; 
  year[16] = 2017;
  year[17] = 2018;
  year[18] = 2019;
  year[19] = 2020;


    //Column titles of graph
    System.out.print("Year");
    UtilityBelt.printCentered(55,"CO₂ in Atmosphere (ppm)");    
    System.out.println();
    printGraph(co2Levels, year);
    


  }

 public static void printBar(double co2Level)
 {  
   int barrels = (int)(co2Level - 360); // 360 is the lowest level, so we subtract that to get the number of symbols to print
   for(int i = 0; i < barrels; i++)
   {
     System.out.print("🛢");
   }
   System.out.println(" " + co2Level + " ppm"); //prints the level at the end of the bar
}

public static void printGraph(double[] co2Levels, int[] year)
{ 
  for(int i = 0; i < co2Levels.length; i++)
  {
    System.out.print(year[i] + " ");
    printBar(co2Levels[i]);
  }

  System.out.println("From " + year[0] + " to " + year[19] + ", the average atmospheric CO₂ levels across the globe has grown " + String.format("%.2f", co2Levels[19] - co2Levels[0]) + " ppm");
}

}