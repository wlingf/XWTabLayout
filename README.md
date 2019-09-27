# XWTabLayout

### 在FlycoTabLayout的基础上修改，CommonTabLayout支持网络图片



- ### 1.初始化XWTabLayout，建议在Application初始化

```
XWTabLayout.init(XWTabLayoutConfig.newBuilder(this)
                .setXWTabLayoutLoader(new CustomTabLayoutLoader())
                .build());
                
````

- ### 2.自定义图片加载框架

```
public class CustomTabLayoutLoader implements XWTabLayoutLoader {

    @Override
    public void load(Context context, ImageView view, String url) {
        Glide.with(context)
                .load(url)
                .into(view);
    }
}
```               
- ### 3.按照[FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout)的api进行相应的设置

