package example3.Component.Leaf;

import example3.Component.AbstractFile;

/**
 * 视频文件类：叶子构件
 *
 * @author wuzz
 * @date 2018年10月11日 上午9:37:10
 */
public class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}
