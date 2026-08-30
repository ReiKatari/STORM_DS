package zd;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import ij.i;
import java.io.InputStream;
import java.util.List;
import kf.d1;
import oe.e0;
import oe.f0;
import p7.t;
import yb.k;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d implements f {

    /* renamed from: d  reason: collision with root package name */
    public static final List f15046d = t.y("nds", "dsi", "ids");

    /* renamed from: a  reason: collision with root package name */
    public final Context f15047a;

    /* renamed from: b  reason: collision with root package name */
    public final be.c f15048b;

    /* renamed from: c  reason: collision with root package name */
    public final d1 f15049c;

    public d(Context context, be.c cVar, d1 d1Var) {
        this.f15047a = context;
        this.f15048b = cVar;
        this.f15049c = d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable h(zd.d r4, ze.a r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof zd.c
            if (r0 == 0) goto L13
            r0 = r6
            zd.c r0 = (zd.c) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            zd.c r0 = new zd.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)     // Catch: zd.a -> L46
            goto L43
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L2e:
            p7.j.I(r6)
            kf.d1 r6 = r4.f15049c
            android.net.Uri r6 = r6.d(r5, r3)
            if (r6 == 0) goto L3a
            return r6
        L3a:
            r0.Y = r3     // Catch: zd.a -> L46
            java.lang.Object r6 = r4.e(r5, r0)     // Catch: zd.a -> L46
            if (r6 != r1) goto L43
            return r1
        L43:
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: zd.a -> L46
            return r6
        L46:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.h(zd.d, ze.a, ec.c):java.lang.Comparable");
    }

    @Override // zd.f
    public final e0 a(ze.a aVar) {
        aVar.getClass();
        try {
            InputStream f8 = f(aVar);
            if (f8 == null) {
                return null;
            }
            e0 G = a.a.G(aVar, f8);
            f8.close();
            return G;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // zd.f
    public final Object b(ze.a aVar, pf.f fVar) {
        return h(this, aVar, fVar);
    }

    @Override // zd.f
    public final Bitmap c(ze.a aVar) {
        aVar.getClass();
        try {
            InputStream f8 = f(aVar);
            if (f8 == null) {
                return null;
            }
            Bitmap F = a.a.F(f8);
            f8.close();
            return F;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // zd.f
    public final ze.a d(Uri uri, Uri uri2) {
        ze.a aVar;
        af.a aVar2;
        try {
            InputStream openInputStream = this.f15047a.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            i g10 = g(openInputStream);
            if (g10 != null) {
                k6.a a10 = this.f15048b.a(uri);
                f0 H = a.a.H(g10);
                String str = H.f10929a;
                str.getClass();
                String replace = str.replace((char) 0, '\t');
                replace.getClass();
                if (vc.h.j0(replace)) {
                    str = null;
                }
                if (str == null) {
                    if (a10 != null) {
                        str = ij.a.V(a10);
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                }
                String str2 = H.f10930b;
                String str3 = (a10 == null || (str3 = a10.f()) == null) ? "" : "";
                if (H.f10931c) {
                    aVar2 = new af.a(af.f.DSi, af.h.DEFAULT, null, af.d.f715b, null);
                } else {
                    aVar2 = new af.a(31);
                }
                ze.a aVar3 = new ze.a(str, str2, str3, uri, uri2, aVar2, null, H.f10931c, H.f10932d);
                g10.close();
                aVar = aVar3;
            } else {
                aVar = null;
            }
            openInputStream.close();
            return aVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public final Object e(ze.a aVar, c cVar) {
        d1 d1Var = this.f15049c;
        cc.c A = pc.a.A(cVar);
        cc.i iVar = new cc.i(A, dc.a.UNDECIDED);
        InputStream openInputStream = this.f15047a.getContentResolver().openInputStream(aVar.f15056d);
        if (openInputStream != null) {
            try {
                i g10 = g(openInputStream);
                if (g10 != null) {
                    d1Var.a(aVar, new b(g10, iVar));
                    if (x.s(A.g())) {
                        Uri d4 = d1Var.d(aVar, false);
                        if (d4 == null) {
                            iVar.h(new k(new Exception("Failed to find extracted NDS ROM file")));
                        } else {
                            iVar.h(d4);
                        }
                    }
                    g10.close();
                } else {
                    iVar.h(new k(new Exception("Failed to find an NDS ROM to extract")));
                }
                openInputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    l0.f.f(openInputStream, th2);
                    throw th3;
                }
            }
        } else {
            iVar.h(new k(new Exception("Failed to open compressed file for extraction")));
        }
        return iVar.a();
    }

    public final InputStream f(ze.a aVar) {
        Uri d4 = this.f15049c.d(aVar, false);
        Context context = this.f15047a;
        if (d4 != null) {
            return context.getContentResolver().openInputStream(d4);
        }
        InputStream openInputStream = context.getContentResolver().openInputStream(aVar.f15056d);
        if (openInputStream != null) {
            return g(openInputStream);
        }
        return null;
    }

    public abstract i g(InputStream inputStream);
}
