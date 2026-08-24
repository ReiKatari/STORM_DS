package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek1  reason: default package */
/* loaded from: classes.dex */
public final class ek1 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public bk1 g;
    public int h;
    public final /* synthetic */ lk1 i;

    public ek1(lk1 lk1Var, String str) {
        this.i = lk1Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.A.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.A.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final gk1 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            lk1 lk1Var = this.i;
            if (i < size) {
                if (!lk1Var.l0.v((lt4) arrayList.get(i))) {
                    try {
                        lk1Var.A(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            } else {
                this.h++;
                return new gk1(lk1Var, this);
            }
        }
    }
}
