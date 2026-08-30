package defpackage;

import android.content.Context;
import defpackage.n11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: my3  reason: default package */
/* loaded from: classes.dex */
public final class my3 implements fy3 {
    public final Context a;
    public final t63 b;

    public my3(Context context, t63 t63Var) {
        this.a = context;
        this.b = t63Var;
    }

    @Override // defpackage.fy3
    public final int a() {
        return 33;
    }

    @Override // defpackage.fy3
    public final int b() {
        return 34;
    }

    @Override // defpackage.fy3
    public final void c() {
        e03 c03Var;
        t63 t63Var = this.b;
        File file = new File(this.a.getFilesDir(), "controller_config.json");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            m93 serializer = o11.Companion.serializer();
            serializer.getClass();
            t71 t71Var = new t71(fileInputStream);
            gk0 gk0Var = (gk0) t71Var.B;
            Object n = ep2.n(t63Var, serializer, t71Var);
            gk0Var.getClass();
            n70 n70Var = n70.c;
            byte[] array = gk0Var.c.array();
            array.getClass();
            n70Var.getClass();
            n70Var.a(array);
            o11 o11Var = (o11) n;
            fileInputStream.close();
            List<i03> g = o11Var.g();
            ArrayList arrayList = new ArrayList(uq0.y0(g, 10));
            for (i03 i03Var : g) {
                if (i03Var.j() == -1) {
                    c03Var = d03.a;
                } else {
                    c03Var = new c03(i03Var.j(), null);
                }
                arrayList.add(new f03(i03Var.h(), c03Var, 4));
            }
            m11 m11Var = new m11(arrayList);
            n11.b bVar = n11.Companion;
            bVar.getClass();
            n11 a = n11.b.a(m11Var);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            m93 serializer2 = bVar.serializer();
            serializer2.getClass();
            oi oiVar = new oi(fileOutputStream);
            byte[] bArr = (byte[]) oiVar.R;
            try {
                ep2.p(t63Var, oiVar, serializer2, a);
                fileOutputStream.close();
            } finally {
                oiVar.b();
                ak0 ak0Var = ak0.c;
                char[] cArr = (char[]) oiVar.X;
                ak0Var.getClass();
                cArr.getClass();
                ak0Var.b(cArr);
                o70 o70Var = o70.c;
                o70Var.getClass();
                bArr.getClass();
                o70Var.a(bArr);
            }
        } catch (Exception unused) {
            file.delete();
        }
    }
}
