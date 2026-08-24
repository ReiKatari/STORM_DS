package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp1  reason: default package */
/* loaded from: classes.dex */
public abstract class lp1 {
    public static final java.lang.reflect.Field a = null;

    static {
            r0 = 0
            java.lang.Class<android.widget.AbsListView> r1 = android.widget.AbsListView.class
            java.lang.String r2 = "mIsChildViewEnabled"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Le
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Le
            goto L12
        Le:
            r1 = move-exception
            r1.printStackTrace()
        L12:
            defpackage.lp1.a = r0
            return
    }
}
