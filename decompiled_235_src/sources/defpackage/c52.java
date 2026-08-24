package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c52  reason: default package */
/* loaded from: classes.dex */
public final class c52 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ o52 L;
    public final /* synthetic */ z72 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c52(o52 o52Var, z72 z72Var, int i) {
        super(1);
        this.B = i;
        this.L = o52Var;
        this.R = z72Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r7.a.d != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        r5 = 0.92f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r6.a.d != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
        if (r7.a.a != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
        r5 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
        if (r6.a.a != null) goto L43;
     */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        rc2 rc2Var;
        rc2 rc2Var2;
        int i = this.B;
        float f = 1.0f;
        o52 o52Var = this.L;
        z72 z72Var = this.R;
        switch (i) {
            case 0:
                aa7 aa7Var = (aa7) obj;
                z42 z42Var = z42.PreEnter;
                z42 z42Var2 = z42.Visible;
                if (aa7Var.b(z42Var, z42Var2)) {
                    i92 i92Var = o52Var.a.a;
                    if (i92Var == null || (rc2Var2 = i92Var.a) == null) {
                        return i52.b;
                    }
                    return rc2Var2;
                } else if (aa7Var.b(z42Var2, z42.PostExit)) {
                    i92 i92Var2 = z72Var.a.a;
                    if (i92Var2 == null || (rc2Var = i92Var2.a) == null) {
                        return i52.b;
                    }
                    return rc2Var;
                } else {
                    return i52.b;
                }
            case 1:
                int i2 = d52.a[((z42) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        break;
                    } else if (i2 != 3) {
                        i.d();
                        return null;
                    } else {
                        break;
                    }
                }
                return Float.valueOf(f);
            case 2:
                aa7 aa7Var2 = (aa7) obj;
                z42 z42Var3 = z42.PreEnter;
                z42 z42Var4 = z42.Visible;
                if (aa7Var2.b(z42Var3, z42Var4)) {
                    z56 z56Var = o52Var.a.d;
                    if (z56Var != null) {
                        return z56Var.b;
                    }
                    return i52.b;
                } else if (aa7Var2.b(z42Var4, z42.PostExit)) {
                    z56 z56Var2 = z72Var.a.d;
                    if (z56Var2 != null) {
                        return z56Var2.b;
                    }
                    return i52.b;
                } else {
                    return i52.b;
                }
            default:
                int i3 = e52.a[((z42) obj).ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        break;
                    } else if (i3 != 3) {
                        i.d();
                        return null;
                    } else {
                        break;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
