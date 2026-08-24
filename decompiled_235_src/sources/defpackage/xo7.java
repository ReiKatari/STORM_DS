package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo7  reason: default package */
/* loaded from: classes.dex */
public final class xo7 {
    public static os0 a(bp7 bp7Var, yo7 yo7Var, int i) {
        j71 j71Var;
        if ((i & 2) != 0) {
            if (bp7Var instanceof mw2) {
                yo7Var = ((mw2) bp7Var).getDefaultViewModelProviderFactory();
            } else {
                yo7Var = eg1.b;
            }
        }
        if (bp7Var instanceof mw2) {
            j71Var = ((mw2) bp7Var).getDefaultViewModelCreationExtras();
        } else {
            j71Var = h71.b;
        }
        yo7Var.getClass();
        j71Var.getClass();
        return new os0(bp7Var.getViewModelStore(), yo7Var, j71Var);
    }
}
