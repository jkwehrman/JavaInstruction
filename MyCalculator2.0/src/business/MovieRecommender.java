package business;

public class MovieRecommender {
	
	

	private static String[] movieName = {        
			"Singin' In the Rain",
			"The King and I",
			"Seven Brides for Seven Brothers",
			"South Pacific",
			"Flower Drum Song",
			"West Side Story",
			"The Music Man",
			"The Sound of Music",
			"Hello Dolly",
			"O Brother Where Art Thou",
			"The Blues Brothers",
			"Guys and Dolls",
			"Little Shop of Horrors",
	"Les Miserables - The 25th Anniversary Concert"};

	private static String[] movieDescription = {
			"Wonderful. Amazing, athletic dancing and funny, dialog tell about the early days of Hollywood talkies.",
			"the small details, lots of little jokes, wonderful costumes and even a lesson on the evils of slavery tell a great true-ish story.",
			"Pioneering fun with athletic dancing, a great, strong leading lady and lots of sexism.",
			"we see the trials of love and waiting in paradise during WWII",
			"1st and 2nd generation Chinese-Americans learning to find the balance between cultures	",
			"we experience a Unique retelling of Romeo and Juliet, amazing dancing and the fabulous Rita Moreno	",
			"a traveling salesman promises to form the boys of a small Iowa town into a marching band",
			"we see that music can heal a family at the start of WWII",
			"everyone's life and love collides in one amazing day in New York City",
			"there is a depression-era Odyssey with bluegrass music and a collection of oddball characters",
			" 'A Mission from God' takes a lot of crazy turns with lively music, dancing and car crashes"	,
			"the world of gangsters and gamblers collide with missionaries in New York City."	,
			"a nerdy orphaned florist finds a strange new plant which leads to romance, fame, riches and murder.",
	"you see how your life is not so bad compared to these french people, but it doesnt really matter since they all die by the end"	};


	private static String[] movieDontMissPart = {
			"Make 'Em Laugh",
			"Shall We Dance' dance with the huge dress throwing her around the dance floor and Rita Moreno"	,
			"The boys showing off with a dance-off at the barn raising"	,
			"There is Nothing Like a Dame - watch out for Stewpot!"	,
			"A Hundred Million Miracles, Dont Marry Me and I Enjoy Being a Girl"	,
			"America and the Jets and the Sharks dance fighting"	,
			"The skip Robert Preson makes every time he walks and Ya Got Trouble"	,
			"Everything Julie Andrews touches is a delight. Marnie Nixon's only big scene, Sister Sophia She Waltzes on the way to church and whistles on the stair."	,
			"Dolly's amazing dress during Hello Dolly, Michael Crawford singing, Tommy Tune dancing"	,
			"Down to the River to Pray and I am a Man of Constant Sorrow"	,
			"All the Songs!!!  Watch this."	,
			"Luck Be a Lady and Sit Down You're Rockin' the Boat"	,
			"The 1960's girl group that narrates the action, Suddenly Seymour"	,
	"When all the people and the chorus and the orchestra play Do you Hear the People Sing?"	};
	
	 public static String getmovieRecommendation(int movieRecommender) {
	        String movieString;
	        
	        movieString=("Your recommended movie is " + movieName[movieRecommender] + " in which " + movieDescription[movieRecommender] + ".  " +
	        "It is ok if you can't watch the whole thing.  At least watch " + movieDontMissPart[movieRecommender] + " on Youtube.\n\n");

	        return movieString;
	    }
	
	
}
