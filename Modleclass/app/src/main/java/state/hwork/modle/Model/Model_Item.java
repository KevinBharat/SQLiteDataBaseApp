package state.hwork.modle.Model;

public class Model_Item {
        String title;
        String subtitle;
        int imgLang;
        public Model_Item(String title, String subtitle, int imgLang){
                this.title=title;
                this.subtitle=subtitle;
                this.imgLang=imgLang;
        }
        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getSubtitle() {
                return subtitle;
        }

        public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
        }

        public int getImgLang() {
                return imgLang;
        }

        public void setImgLang(int imgLang) {
                this.imgLang = imgLang;
        }

}
