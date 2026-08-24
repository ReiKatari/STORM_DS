package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj0  reason: default package */
/* loaded from: classes.dex */
public final class jj0 implements fh2 {
    public static final jj0 a = new Object();
    public static Boolean b;

    @Override // defpackage.fh2
    public final void a() {
        b = Boolean.FALSE;
    }

    @Override // defpackage.fh2
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw i61.e("canFocus is read before it is written");
    }
}
