import java.util.List;


    public class Folder {
        private List<Audio_file> Audio_files;
        private List<Image_file> Image_files;
        private List<Text_file> Text_files;

        public List<Audio_file> getAudio_files() {

            return Audio_files;
        }

        public void setAudio_file(List<Audio_file> Audio_files) {

            this.Audio_files = Audio_files;
        }

        public List<Image_file> getImage_files() {

            return Image_files;
        }

        public void setImage_files(List<Image_file> Image_files) {

            this.Image_files = Image_files;
        }

        public List<Text_file> getTText_files() {

            return Text_files;
        }

        public void setTextFiles(List<Text_file> Text_files) {
            this.Text_files = Text_files;

        }

    }