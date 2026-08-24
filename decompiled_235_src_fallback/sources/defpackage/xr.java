package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr  reason: default package */
/* loaded from: classes.dex */
public abstract class xr {
    public static void a(android.widget.ThemedSpinnerAdapter r1, android.content.res.Resources.Theme r2) {
            android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto Ld
            r1.setDropDownViewTheme(r2)
        Ld:
            return
    }
}
