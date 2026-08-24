package defpackage;

import android.content.Context;
import defpackage.v41;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f64  reason: default package */
/* loaded from: classes.dex */
public final class f64 implements y54 {
    public final Context a;
    public final id3 b;

    public f64(Context context, id3 id3Var) {
        this.a = context;
        this.b = id3Var;
    }

    @Override // defpackage.y54
    public final int a() {
        return 33;
    }

    @Override // defpackage.y54
    public final void b() {
        h63 f63Var;
        id3 id3Var = this.b;
        File file = new File(this.a.getFilesDir(), "controller_config.json");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            gg3 serializer = w41.Companion.serializer();
            serializer.getClass();
            s63 s63Var = new s63(fileInputStream);
            pm0 pm0Var = (pm0) s63Var.B;
            Object s = oi2.s(id3Var, serializer, s63Var);
            pm0Var.getClass();
            u90 u90Var = u90.c;
            byte[] array = pm0Var.c.array();
            array.getClass();
            u90Var.getClass();
            u90Var.a(array);
            w41 w41Var = (w41) s;
            fileInputStream.close();
            List<l63> g = w41Var.g();
            ArrayList arrayList = new ArrayList(ht0.v0(g, 10));
            for (l63 l63Var : g) {
                if (l63Var.j() == -1) {
                    f63Var = g63.a;
                } else {
                    f63Var = new f63(l63Var.j(), null);
                }
                arrayList.add(new i63(l63Var.h(), f63Var, 4));
            }
            u41 u41Var = new u41(arrayList);
            v41.b bVar = v41.Companion;
            bVar.getClass();
            v41 a = v41.b.a(u41Var);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            gg3 serializer2 = bVar.serializer();
            serializer2.getClass();
            aj ajVar = new aj(fileOutputStream);
            byte[] bArr = (byte[]) ajVar.R;
            try {
                oi2.v(id3Var, ajVar, serializer2, a);
                fileOutputStream.close();
            } finally {
                ajVar.b();
                jm0 jm0Var = jm0.c;
                char[] cArr = (char[]) ajVar.X;
                jm0Var.getClass();
                cArr.getClass();
                jm0Var.b(cArr);
                v90 v90Var = v90.c;
                v90Var.getClass();
                bArr.getClass();
                v90Var.a(bArr);
            }
        } catch (Exception unused) {
            file.delete();
        }
    }

    @Override // defpackage.y54
    public final int c() {
        return 34;
    }
}
