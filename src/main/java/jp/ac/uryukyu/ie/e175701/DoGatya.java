package jp.ac.uryukyu.ie.e175701;

public class DoGatya {



    public void DoGtya(){
            int ran = (int)(Math.random()*100);

        if (ran == 0){
            int hosi5saba = (int)(Math.random()*5);
            if(hosi5saba == 0) {
                System.out.println("☆☆☆☆☆ アルトリア・ペンドラゴン");
            }
            if(hosi5saba == 1) {
                System.out.println("☆☆☆☆☆ アルテラ");
            }
            if(hosi5saba == 2) {
                System.out.println("☆☆☆☆☆ 諸葛孔明");
            }
            if(hosi5saba == 3) {
                System.out.println("☆☆☆☆☆ ヴラド三世");
            }
            else {
                System.out.println("☆☆☆☆☆ ジャンヌ・ダルク");
            }
        }
        if ( 0<ran && ran<4){
            int hosi4saba = (int)(Math.random()*13);
            if(hosi4saba == 0) {
                System.out.println("☆☆☆☆ アルトリア・ペンドラゴン[オルタ]");
            }
            if(hosi4saba == 1) {
                System.out.println("☆☆☆☆ ジークフリート");
            }
            if(hosi4saba == 2) {
                System.out.println("☆☆☆☆ シュヴァリエ・デオン");
            }
            if(hosi4saba == 3) {
                System.out.println("☆☆☆☆ エミヤ");
            }
            if(hosi4saba == 4) {
                System.out.println("☆☆☆☆ アタランテ");
            }
            if(hosi4saba == 5) {
                System.out.println("☆☆☆☆ エリザベート・バートリー");
            }
            if(hosi4saba == 6) {
                System.out.println("☆☆☆☆ マリー・アントワネット");
            }
            if(hosi4saba == 7) {
                System.out.println("☆☆☆☆ マルタ");
            }
            if(hosi4saba == 8) {
                System.out.println("☆☆☆☆ ステンノ");
            }
            if(hosi4saba == 9) {
                System.out.println("☆☆☆☆ カーミラ");
            }
            if(hosi4saba == 10) {
                System.out.println("☆☆☆☆ ヘラクレス");
            }
            if(hosi4saba == 11) {
                System.out.println("☆☆☆☆ ランスロット");
            }
            else {
                System.out.println("☆☆☆☆ タマモキャット");
            }
        }
        if (3 < ran&&ran <20 ){
            System.out.println("☆☆☆　サーヴァント");
        }
        if (19 < ran&&ran <24){
            System.out.println("☆☆☆☆☆ 礼装");
        }
        if (23< ran&&ran <40 ){
            System.out.println("☆☆☆☆ 礼装 ");
        }
        else{
            System.out.println("☆☆☆ 礼装");
        }




    }

    }


