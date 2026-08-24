package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk1  reason: default package */
/* loaded from: classes.dex */
public final class dk1 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public bk1 g;
    public int h;
    public long i;
    public final /* synthetic */ kk1 j;

    public dk1(kk1 kk1Var, String str) {
        str.getClass();
        this.j = kk1Var;
        this.a = str;
        kk1Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.A.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.A.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final fk1 a() {
        TimeZone timeZone = az7.a;
        if (this.e) {
            kk1 kk1Var = this.j;
            if (kk1Var.h0 || (this.g == null && !this.f)) {
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.b.clone();
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    try {
                        in6 N = kk1Var.B.N((lt4) this.c.get(i2));
                        if (!kk1Var.h0) {
                            this.h++;
                            N = new ck1(N, kk1Var, this);
                        }
                        arrayList.add(N);
                    } catch (FileNotFoundException unused) {
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            yy7.b((in6) obj);
                        }
                        try {
                            kk1Var.F(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new fk1(this.j, this.a, this.i, arrayList, jArr);
            }
            return null;
        }
        return null;
    }
}
