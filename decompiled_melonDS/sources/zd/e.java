package zd;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;
import oe.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15050a;

    /* renamed from: b  reason: collision with root package name */
    public final be.c f15051b;

    public e(Context context, be.c cVar) {
        this.f15050a = context;
        this.f15051b = cVar;
    }

    @Override // zd.f
    public final e0 a(ze.a aVar) {
        aVar.getClass();
        try {
            InputStream openInputStream = this.f15050a.getContentResolver().openInputStream(aVar.f15056d);
            if (openInputStream == null) {
                return null;
            }
            e0 G = a.a.G(aVar, openInputStream);
            openInputStream.close();
            return G;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // zd.f
    public final Object b(ze.a aVar, pf.f fVar) {
        return aVar.f15056d;
    }

    @Override // zd.f
    public final Bitmap c(ze.a aVar) {
        aVar.getClass();
        try {
            InputStream openInputStream = this.f15050a.getContentResolver().openInputStream(aVar.f15056d);
            if (openInputStream == null) {
                return null;
            }
            Bitmap F = a.a.F(openInputStream);
            openInputStream.close();
            return F;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0005, B:6:0x0015, B:16:0x0024, B:23:0x0047, B:30:0x0055, B:32:0x005c, B:35:0x0063, B:37:0x0067, B:40:0x0080, B:39:0x0078, B:5:0x0011), top: B:45:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078 A[Catch: Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0005, B:6:0x0015, B:16:0x0024, B:23:0x0047, B:30:0x0055, B:32:0x005c, B:35:0x0063, B:37:0x0067, B:40:0x0080, B:39:0x0078, B:5:0x0011), top: B:45:0x0005 }] */
    @Override // zd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ze.a d(android.net.Uri r20, android.net.Uri r21) {
        /*
            r19 = this;
            r1 = r19
            r6 = r20
            r12 = 0
            android.content.Context r0 = r1.f15050a     // Catch: java.lang.Exception -> L4c
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L4c
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L21
            oe.f0 r0 = a.a.H(r2)     // Catch: java.lang.Throwable -> L19
            r2.close()     // Catch: java.lang.Exception -> L4c
            goto L22
        L19:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            l0.f.f(r2, r3)     // Catch: java.lang.Exception -> L4c
            throw r0     // Catch: java.lang.Exception -> L4c
        L21:
            r0 = r12
        L22:
            if (r0 == 0) goto L8b
            be.c r2 = r1.f15051b     // Catch: java.lang.Exception -> L4c
            k6.a r2 = r2.a(r6)     // Catch: java.lang.Exception -> L4c
            java.lang.String r3 = r0.f10929a     // Catch: java.lang.Exception -> L4c
            r3.getClass()     // Catch: java.lang.Exception -> L4c
            r4 = 0
            r5 = 9
            java.lang.String r4 = r3.replace(r4, r5)     // Catch: java.lang.Exception -> L4c
            r4.getClass()     // Catch: java.lang.Exception -> L4c
            boolean r4 = vc.h.j0(r4)     // Catch: java.lang.Exception -> L4c
            if (r4 != 0) goto L40
            goto L41
        L40:
            r3 = r12
        L41:
            java.lang.String r4 = ""
            if (r3 != 0) goto L54
            if (r2 == 0) goto L4e
            java.lang.String r3 = ij.a.V(r2)     // Catch: java.lang.Exception -> L4c
            goto L4f
        L4c:
            r0 = move-exception
            goto L8c
        L4e:
            r3 = r12
        L4f:
            if (r3 != 0) goto L54
            r5 = r2
            r3 = r4
            goto L55
        L54:
            r5 = r2
        L55:
            ze.a r2 = new ze.a     // Catch: java.lang.Exception -> L4c
            r7 = r4
            java.lang.String r4 = r0.f10930b     // Catch: java.lang.Exception -> L4c
            if (r5 == 0) goto L62
            java.lang.String r5 = r5.f()     // Catch: java.lang.Exception -> L4c
            if (r5 != 0) goto L63
        L62:
            r5 = r7
        L63:
            boolean r7 = r0.f10931c     // Catch: java.lang.Exception -> L4c
            if (r7 == 0) goto L78
            af.a r13 = new af.a     // Catch: java.lang.Exception -> L4c
            af.f r14 = af.f.DSi     // Catch: java.lang.Exception -> L4c
            af.h r15 = af.h.DEFAULT     // Catch: java.lang.Exception -> L4c
            af.d r17 = af.d.f715b     // Catch: java.lang.Exception -> L4c
            r18 = 0
            r16 = 0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L4c
        L76:
            r8 = r13
            goto L80
        L78:
            af.a r13 = new af.a     // Catch: java.lang.Exception -> L4c
            r7 = 31
            r13.<init>(r7)     // Catch: java.lang.Exception -> L4c
            goto L76
        L80:
            boolean r10 = r0.f10931c     // Catch: java.lang.Exception -> L4c
            java.lang.String r11 = r0.f10932d     // Catch: java.lang.Exception -> L4c
            r9 = 0
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L4c
            return r2
        L8b:
            return r12
        L8c:
            r0.printStackTrace()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.e.d(android.net.Uri, android.net.Uri):ze.a");
    }
}
