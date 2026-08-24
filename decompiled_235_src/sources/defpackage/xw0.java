package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw0  reason: default package */
/* loaded from: classes.dex */
public final class xw0 extends dm5 implements eo2 {
    public int L;
    public int R;
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ yw0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(yw0 yw0Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = yw0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((xw0) q((r41) obj2, (rb6) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        xw0 xw0Var = new xw0(this.d0, r41Var);
        xw0Var.Z = obj;
        return xw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0176 -> B:31:0x0178). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i;
        rb6 rb6Var;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        String str2;
        yw0 yw0Var = this.d0;
        ca4 ca4Var = yw0Var.A;
        o94 o94Var = yw0Var.L;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i7 = this.Y;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = this.X;
                int i9 = this.R;
                int i10 = this.L;
                rb6Var = (rb6) this.Z;
                oi2.Y(obj);
                int i11 = i8;
                i2 = i9;
                boolean z = true;
                int i12 = i10;
                i3 = i11;
                i = i12;
                if (i < Math.min(yw0Var.R + 10, o94Var.b)) {
                    int i13 = i + 1;
                    int c = o94Var.c(i);
                    switch (c) {
                        case 0:
                            str = "up";
                            i4 = i2;
                            i5 = i3;
                            i10 = i13;
                            break;
                        case 1:
                            int i14 = i2 + 1;
                            str = "down " + ca4Var.f(i2);
                            i4 = i14;
                            i5 = i3;
                            i10 = i13;
                            break;
                        case 2:
                            i4 = i2;
                            i5 = i3;
                            i10 = i + 3;
                            str = "remove " + o94Var.c(i13) + ' ' + o94Var.c(i + 2);
                            break;
                        case 3:
                            str = "move " + o94Var.c(i13) + ' ' + o94Var.c(i + 2) + ' ' + o94Var.c(i + 3);
                            i4 = i2;
                            i5 = i3;
                            i10 = i + 4;
                            break;
                        case 4:
                            str = "clear";
                            i4 = i2;
                            i5 = i3;
                            i10 = i13;
                            break;
                        case 5:
                            i6 = i + 2;
                            i4 = i2 + 1;
                            str2 = "insertBottomUp " + o94Var.c(i13) + ' ' + ca4Var.f(i2);
                            int i15 = i6;
                            str = str2;
                            i5 = i3;
                            i10 = i15;
                            break;
                        case 6:
                            i6 = i + 2;
                            i4 = i2 + 1;
                            str2 = "insertTopDown " + o94Var.c(i13) + ' ' + ca4Var.f(i2);
                            int i152 = i6;
                            str = str2;
                            i5 = i3;
                            i10 = i152;
                            break;
                        case 7:
                            Object f = ca4Var.f(i2);
                            f.getClass();
                            ge7.p(2, f);
                            i2 += 2;
                            str = "apply " + ((eo2) f);
                            i4 = i2;
                            i5 = i3;
                            i10 = i13;
                            break;
                        case 8:
                            str = "reuse " + yw0Var.B.f(i3);
                            i3++;
                            i4 = i2;
                            i5 = i3;
                            i10 = i13;
                            break;
                        case 9:
                            str = "recompose pending";
                            i4 = i2;
                            i5 = i3;
                            i10 = i13;
                            break;
                        default:
                            str = lb1.g(c, "unknown op: ");
                            i4 = i2;
                            i5 = i3;
                            i10 = i13;
                            break;
                    }
                    String str3 = i + ": " + str;
                    this.Z = rb6Var;
                    this.L = i10;
                    this.R = i4;
                    this.X = i5;
                    z = true;
                    this.Y = 1;
                    if (rb6Var.c(this, str3) == x61Var) {
                        return x61Var;
                    }
                    i11 = i5;
                    i2 = i4;
                    int i122 = i10;
                    i3 = i11;
                    i = i122;
                    if (i < Math.min(yw0Var.R + 10, o94Var.b)) {
                        return jg7.a;
                    }
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            i = 0;
            rb6Var = (rb6) this.Z;
            i2 = 0;
            i3 = 0;
            if (i < Math.min(yw0Var.R + 10, o94Var.b)) {
            }
        }
    }
}
