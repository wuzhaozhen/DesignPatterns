package example2.Component;

/**
 * 抽象文件类：抽象构件
 *
 * @author wuzz
 * @date 2018年10月11日 上午9:27:37
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}