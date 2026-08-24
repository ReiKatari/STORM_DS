package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n  reason: default package */
/* loaded from: classes.dex */
public final class n extends nc2 {
    public final /* synthetic */ int A;

    /* JADX WARN: Type inference failed for: r0v6, types: [di6, dy7, java.lang.Object] */
    @Override // defpackage.nc2
    public final InputStream a(InputStream inputStream, mu muVar) {
        switch (this.A) {
            case 0:
                ga0 ga0Var = new ga0(3);
                ga0Var.b = 8;
                return new fi6(inputStream, ga0Var);
            case 1:
                ga0 ga0Var2 = new ga0(4);
                ga0Var2.b = 4;
                return new fi6(inputStream, ga0Var2);
            case 2:
                ga0 ga0Var3 = new ga0(1);
                ga0Var3.b = 0;
                return new fi6(inputStream, ga0Var3);
            case 3:
                ga0 ga0Var4 = new ga0(6);
                ga0Var4.b = 0;
                return new fi6(inputStream, ga0Var4);
            case 4:
                ga0 ga0Var5 = new ga0(7);
                ga0Var5.b = 0;
                return new fi6(inputStream, ga0Var5);
            default:
                ?? obj = new Object();
                obj.b = 0;
                obj.a = 5;
                return new fi6(inputStream, obj);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
