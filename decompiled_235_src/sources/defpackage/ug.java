package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug  reason: default package */
/* loaded from: classes.dex */
public class ug extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ug(vl5 vl5Var) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        wl5 wl5Var = vl5Var.a;
        sb.append(wl5Var.R);
        sb.append(" ");
        sb.append(wl5Var.L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(int i) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        switch (i) {
            case 14:
                return;
            default:
                return;
        }
    }

    public ug(String str) {
        super(str.toString());
    }
}
