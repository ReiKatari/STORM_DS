package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax2  reason: default package */
/* loaded from: classes.dex */
public final class ax2 extends u {
    public final /* synthetic */ int a;
    public final a50 b;
    public final Serializable c;

    /* JADX WARN: Type inference failed for: r0v1, types: [a21, a50] */
    public ax2() {
        this.a = 1;
        this.b = new a21();
        this.c = new ArrayList();
    }

    @Override // defpackage.u
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.u
    public void c() {
        int i;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char charAt = charSequence.charAt(i2);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 == -1) {
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < size + 1; i++) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((i43) this.b).g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.u
    public final a50 d() {
        int i = this.a;
        a50 a50Var = this.b;
        switch (i) {
            case 0:
                return (zw2) a50Var;
            default:
                return (i43) a50Var;
        }
    }

    @Override // defpackage.u
    public void f(v53 v53Var) {
        switch (this.a) {
            case 0:
                v53Var.f((String) this.c, (zw2) this.b);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (am1Var.g >= 4) {
                    return new b50(-1, false, am1Var.c + 4);
                }
                if (!am1Var.h) {
                    return null;
                }
                return b50.a(am1Var.e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a21, zw2, a50] */
    public ax2(int i, String str) {
        this.a = 0;
        ?? a21Var = new a21();
        this.b = a21Var;
        a21Var.g = i;
        this.c = str;
    }
}
