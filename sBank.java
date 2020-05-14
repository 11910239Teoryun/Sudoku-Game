import java.util.Random;

public class sBank {
	private int [][] Puzzle= new int [9][9];
	private int [][] Solution= new int [9][9];
	private String p ="";
	private String s ="";
	
	public sBank(int level) {
		switch(level) {
		case 1:{
			Random ran = new Random();
			int gen = ran.nextInt(10);
			switch(gen) {
			case 0:{
				p = "000012300000400000105006700306000070700080009020000108001500403000001000003890000";
				s = "968712354237458916145936782386149275714285639529673148891527463452361897673894521";
				break;
				}
			case 1:{
				p ="000012300000300000104005600305000060600070002080000105001400903000001000003720000";
				s="758612349962347851134985627325194768619578432487263195271456983596831274843729516";
				break;
				}
			case 2:{
				p="000012300000400000103005600705000060600080009020000108001300807000001000007890000";
				s ="958612374276438915143975682785149263614283759329567148561324897892751436437896521";
				break;
			}
			case 3:{
				p="000943000060010050000000000800000003750060014100000009000000000020050080000374000";
				s="518943726964712358237685941896421573753869214142537869471298635329156487685374192";
				break;
			}
			case 4:{
				p="001230000004000000005000461000502007500040002100603000826000300000000800000096100";
				s="961234785784165293235789461648512937573948612192673548826451379419327856357896124";
				break;
			}
			case 5:{
				p="000123000000405000002000400630000054500000007780000069008000100000706000000531000";
				s="476123598893465721152879436639217854524698317781354269368942175215786943947531682";
				break;
			}
			case 6:{
				p="008700050003608007710200000974000080000000000030000924000005092600103400040006100";
				s="268741359493658217715239846974362581152894763836517924381475692629183475547926138";
				break;
			}
			case 7:{
				p="010000020230000045000203000006472500000806000007359600000708000840000039060000010";
				s ="619584327238167945574293168186472593953816472427359681391748256845621739762935814";
				break;
			}
			case 8:{
				p="000000000001203400020010050010000060004050700080000020050020010007104300000000000";
				s ="843965172571283496926417853312749568694852731785631924459328617267194385138576249";
				break;
			}
			case 9:{
				p="000000000010234050006000100070405080050000060030802040005000300040617020000000000";
				s ="394156278817234659526789134172465983458391762639872541265948317943617825781523496";
				break;
			}
			}
			break;
			}
		case 2:{
			Random ran = new Random();
			int gen = ran.nextInt(10);
			switch(gen) {
			case 0:{
				p="000123000040050060000000000500000007360040052700000001000000000080060040000732000 ";
				s="876123594142958763935674128598216437361847952724395681613489275287561349459732816";
				break;
			}
			case 1:{
				p ="000012300000400000105006700306000070700080005050000108001200403000001000003890000 ";
				s ="978512346632478591145936782386125974714689235259743168891267453467351829523894617";
				break;
			}
			case 2:{
				p = "000123000040050060000000000700000003860040092900000001000000000050060080000392000";
				s ="678123954142958367539674128715289643863741592924536871297815436351467289486392715";
				break;
			}
			case 3:{
				p ="000123000040050060000000000700000003860040072500000001000000000070060050000382000";
				s ="657123894142958367938674125714296583863541972529837641286715439371469258495382716";
				break;
			}
			case 4:{
				p="000012300000400000105006200306000020200070008080000107001500403000001000003740000";
				s="867912345932457681145836279376185924219674538584293167721568493498321756653749812";
				break;
			}
			case 5:{
				p="000031200000200000509008100201000070400090001090000804007900602000003000003560000";
				s="768431295134259768529678143281345976475896321396127854857914632642783519913562487";
				break;
			}
			case 6:{
				p="001230000004000000002000561000403005700080004300701000258000400000000900000065700";
				s ="571236849964518327832974561189423675725689134346751298258397416617842953493165782";
				break;
			}
			case 7:{
				p="000273000000904000006000200360000059500000007780000023008000100000409000000351000";
				s ="814273596275964381936518274362147859549832617781695423498726135153489762627351948";
				break;
			}
			case 8:{
				p="001200030003401005250600000347000050000000000020000384000002041100804700030007800";
				s ="491275638673481925258639417347928156816543279925716384789362541162854793534197862";
				break;
			}
			case 9:{
				p ="000000000001203400020010030050000020004060700080000060090080050007604200000000000 ";
				s="345896172971253486628417935156749823234568719789321564493182657517634298862975341";
				break;
			}
			}
			break;
		}
		case 3:{
			Random ran = new Random();
			int gen = ran.nextInt(10);
			switch(gen) {
			case 1:{
				p="000000000006302400050010070090000030002050700010000040030070010007604200000000000";
				s="341567928976382451258419673895746132462153789713928546639275814187634295524891367";
				break;
			}
			case 2:{
				p="010000020230000045000204000006532700000706000003849600000905000750000089060000010";
				s="415397826237168945698254173846532791529716438173849652381975264754621389962483517";
				break;
			}
			case 3:{
				p="001200030004506002270800000529000060000000000060000289000002058800703900090005300";
				s="681297435934516872275834691529478163318629547467351289143962758852743916796185324";
				break;
			}
			case 4:{
				p="000327000000405000002000100690000054500000007480000091008000300000902000000568000";
				s="915327486876415923342896175693781254521649837487253691258174369764932518139568742";
				break;
			}
			case 5:{
				p="001230000004000000005000163000102005500070002300608000923000800000000900000016200";
				s="691235478834761529275489163786192345519374682342658791923547816167823954458916237";
				break;
			}
			case 6:{
				p="000091800000400000908003100403000010100020008070000903009800604000009000004250000";
				s="645791832731482569928563147453978216196325478872614953519837624267149385384256791";
				break;
			}
			case 7:{
				p="010000080002000300000705000006040200070000010005030900000901000004000600080000070";
				s="519326784762814359438795126196547238273689415845132967627951843354278691981463572";
				break;
			}
			case 8:{
				p="000000000006070900010203040001090800090832050004060700070109030003080100000000000";
				s="742916385536478912819253647251794863697832451384561729478129536923685174165347298";
				break;
			}
			case 9:{
				p="000000000050203010000456000097000830003070600018000520000894000030701080000000000";
				s="384917265756283419921456378597162834243578691618349527162894753435721986879635142";
				break;
			}
			}//Puzzle reference page:http://forum.enjoysudoku.com/patterns-game-results-t6291.html
			//Helped by https://www.thonky.com/
			break;
		}
		}
		int index =0;
		for(int r =0; r<Puzzle.length; r++) {
			for(int c =0; c<Puzzle[r].length; c++) {
				char a =p.charAt(index);
				int num = Character.getNumericValue(a);
				Puzzle[r][c]=num;
				index++;
			}
		}
		index =0;
		for(int r =0; r<Solution.length; r++) {
			for(int c =0; c<Solution[r].length; c++) {
				char a =s.charAt(index);
				int num = Character.getNumericValue(a);
				Solution[r][c]=num;
				index++;
			}
		}
		}
	public int[][] getPuzzle(){
		return Puzzle;
	}
	public int[][] getSolution(){
		return Solution;
	}
}