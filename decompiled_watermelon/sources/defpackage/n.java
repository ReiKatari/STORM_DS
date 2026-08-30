package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n  reason: default package */
/* loaded from: classes.dex */
public final class n extends u72 {
    public final /* synthetic */ int A;

    /* JADX WARN: Type inference failed for: r0v6, types: [hj7, java.lang.Object, n66] */
    @Override // defpackage.u72
    public final InputStream a(InputStream inputStream, ut utVar) {
        switch (this.A) {
            case 0:
                y70 y70Var = new y70(3);
                y70Var.b = 8;
                return new p66(inputStream, y70Var);
            case 1:
                y70 y70Var2 = new y70(4);
                y70Var2.b = 4;
                return new p66(inputStream, y70Var2);
            case 2:
                y70 y70Var3 = new y70(1);
                y70Var3.b = 0;
                return new p66(inputStream, y70Var3);
            case 3:
                y70 y70Var4 = new y70(6);
                y70Var4.b = 0;
                return new p66(inputStream, y70Var4);
            case 4:
                y70 y70Var5 = new y70(7);
                y70Var5.b = 0;
                return new p66(inputStream, y70Var5);
            default:
                ?? obj = new Object();
                obj.b = 0;
                obj.a = 5;
                return new p66(inputStream, obj);
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
