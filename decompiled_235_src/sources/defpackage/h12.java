package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h12  reason: default package */
/* loaded from: classes.dex */
public final class h12 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ sz1 Y;
    public final /* synthetic */ pq5 Z;
    public final /* synthetic */ c46 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h12(sz1 sz1Var, pq5 pq5Var, c46 c46Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = sz1Var;
        this.Z = pq5Var;
        this.d0 = c46Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((h12) q(r41Var, w61Var)).s(jg7Var);
            default:
                ((h12) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new h12(this.Y, this.Z, this.d0, r41Var, 0);
            default:
                return new h12(this.Y, this.Z, this.d0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        c46 c46Var = this.d0;
        pq5 pq5Var = this.Z;
        sz1 sz1Var = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return sz1Var.s.b(pq5Var, c46Var);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yb2 yb2Var = sz1Var.s;
                yb2Var.getClass();
                pq5Var.getClass();
                c46Var.getClass();
                b46 b46Var = yb2Var.c;
                File a = b46Var.a(pq5Var, c46Var, false);
                if (a != null) {
                    b46Var.c(a);
                    a.delete();
                }
                Bitmap a2 = sz1Var.t.a();
                yb2Var.getClass();
                b46 b46Var2 = yb2Var.c;
                File a3 = b46Var2.a(pq5Var, c46Var, true);
                if (a3 != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(a3);
                    try {
                        a2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        b46Var2.c(a3);
                    } finally {
                    }
                }
                return jg7.a;
        }
    }
}
