package sj;

import java.io.Serializable;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12988a;

    /* renamed from: b  reason: collision with root package name */
    public final vj.a f12989b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializable f12990c;

    /* JADX WARN: Type inference failed for: r0v1, types: [vj.a, v8.e] */
    public i() {
        this.f12988a = 1;
        this.f12989b = new v8.e();
        this.f12990c = new ArrayList();
    }

    @Override // xj.a
    public void a(CharSequence charSequence) {
        switch (this.f12988a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ((ArrayList) this.f12990c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override // xj.a
    public void c() {
        int i2;
        boolean z10;
        switch (this.f12988a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ArrayList arrayList = (ArrayList) this.f12990c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                char charAt = charSequence.charAt(i10);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i10++;
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i2 = 0; i2 < size + 1; i2++) {
                    sb2.append((CharSequence) arrayList.get(i2));
                    sb2.append('\n');
                }
                ((vj.l) this.f12989b).f13854g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override // xj.a
    public final vj.a d() {
        switch (this.f12988a) {
            case 0:
                return (vj.h) this.f12989b;
            default:
                return (vj.l) this.f12989b;
        }
    }

    @Override // xj.a
    public void f(l lVar) {
        switch (this.f12988a) {
            case 0:
                lVar.f((String) this.f12990c, (vj.h) this.f12989b);
                return;
            default:
                return;
        }
    }

    @Override // xj.a
    public final a g(g gVar) {
        switch (this.f12988a) {
            case 0:
                return null;
            default:
                if (gVar.f12977g >= 4) {
                    return new a(-1, false, gVar.f12973c + 4);
                }
                if (gVar.f12978h) {
                    return a.a(gVar.f12975e);
                }
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [vj.a, vj.h, v8.e] */
    public i(int i2, String str) {
        this.f12988a = 0;
        ?? eVar = new v8.e();
        this.f12989b = eVar;
        eVar.f13850g = i2;
        this.f12990c = str;
    }
}
