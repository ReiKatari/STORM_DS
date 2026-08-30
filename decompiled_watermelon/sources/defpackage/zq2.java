package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zq2  reason: default package */
/* loaded from: classes.dex */
public final class zq2 extends t {
    public final /* synthetic */ int a;
    public final c30 b;
    public final Serializable c;

    /* JADX WARN: Type inference failed for: r0v1, types: [c30, vy0] */
    public zq2() {
        this.a = 1;
        this.b = new vy0();
        this.c = new ArrayList();
    }

    @Override // defpackage.t
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.t
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
                ((ey2) this.b).g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.t
    public final c30 d() {
        int i = this.a;
        c30 c30Var = this.b;
        switch (i) {
            case 0:
                return (yq2) c30Var;
            default:
                return (ey2) c30Var;
        }
    }

    @Override // defpackage.t
    public void f(sz2 sz2Var) {
        switch (this.a) {
            case 0:
                sz2Var.f((String) this.c, (yq2) this.b);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (vh1Var.g >= 4) {
                    return new d30(-1, false, vh1Var.c + 4);
                }
                if (!vh1Var.h) {
                    return null;
                }
                return d30.a(vh1Var.e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c30, yq2, vy0] */
    public zq2(int i, String str) {
        this.a = 0;
        ?? vy0Var = new vy0();
        this.b = vy0Var;
        vy0Var.g = i;
        this.c = str;
    }
}
