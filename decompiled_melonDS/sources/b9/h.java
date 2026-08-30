package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import g9.i;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import pi.r;
import q9.j;
import q9.l;
import yb.n;
import zc.g0;
import zc.m1;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2123a;

    /* renamed from: b  reason: collision with root package name */
    public final m9.c f2124b;

    /* renamed from: c  reason: collision with root package name */
    public final n f2125c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2126d;

    /* renamed from: e  reason: collision with root package name */
    public final jb.c f2127e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2128f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2129g;

    /* JADX WARN: Type inference failed for: r5v0, types: [a7.v, java.lang.Object] */
    public h(Context context, m9.c cVar, n nVar, n nVar2, n nVar3, b bVar, j jVar) {
        this.f2123a = context;
        this.f2124b = cVar;
        this.f2125c = nVar;
        this.f2126d = jVar;
        m1 c4 = x.c();
        gd.f fVar = g0.f15015a;
        x.a(pc.a.G(c4, ed.n.f4465a.Y).H(new g(this)));
        l lVar = new l(this);
        jb.c cVar2 = new jb.c(this, lVar);
        this.f2127e = cVar2;
        ?? obj = new Object();
        obj.X = zb.l.q0(bVar.f2113a);
        obj.A = zb.l.q0(bVar.f2114b);
        obj.B = zb.l.q0(bVar.f2115c);
        obj.L = zb.l.q0(bVar.f2116d);
        obj.R = zb.l.q0(bVar.f2117e);
        obj.e(new j9.a(2), r.class);
        obj.e(new j9.a(5), String.class);
        obj.e(new j9.a(1), Uri.class);
        obj.e(new j9.a(4), Uri.class);
        obj.e(new j9.a(3), Integer.class);
        obj.e(new j9.a(0), byte[].class);
        Object obj2 = new Object();
        ArrayList arrayList = (ArrayList) obj.B;
        arrayList.add(new yb.j(obj2, Uri.class));
        arrayList.add(new yb.j(new i9.a(jVar.f12401a), File.class));
        obj.d(new i(nVar3, nVar2, jVar.f12403c), Uri.class);
        obj.d(new g9.a(5), File.class);
        obj.d(new g9.a(0), Uri.class);
        obj.d(new g9.a(3), Uri.class);
        obj.d(new g9.a(6), Uri.class);
        obj.d(new g9.a(4), Drawable.class);
        obj.d(new g9.a(1), Bitmap.class);
        obj.d(new g9.a(2), ByteBuffer.class);
        d9.c cVar3 = new d9.c(jVar.f12404d, jVar.f12405e);
        ArrayList arrayList2 = (ArrayList) obj.R;
        arrayList2.add(cVar3);
        List A = p7.a.A((ArrayList) obj.X);
        this.f2128f = new b(A, p7.a.A((ArrayList) obj.A), p7.a.A(arrayList), p7.a.A((ArrayList) obj.L), p7.a.A(arrayList2));
        this.f2129g = zb.l.d0(A, new h9.g(this, lVar, cVar2));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(3:18|(1:20)(2:25|(1:27)(1:28))|21)(2:29|(1:31)(2:32|33))|22|23)(2:51|52))(12:53|54|55|56|57|58|59|60|61|62|(6:65|15|16|(0)(0)|22|23)|64))(4:76|77|78|79)|75|38|39|(3:41|22|23)(2:42|43))(4:96|97|98|(3:100|(1:102)|104)(2:105|106))|80|81|(1:83)|84|(1:86)|87|(8:89|57|58|59|60|61|62|(0))|64))|109|6|(0)(0)|80|81|(0)|84|(0)|87|(0)|64|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        if (p7.k.d(r0, r2) == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
        r3 = r4;
        r4 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:43:0x00c5, B:45:0x00cf, B:48:0x00d8, B:50:0x00e2, B:51:0x00e5), top: B:99:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:43:0x00c5, B:45:0x00cf, B:48:0x00d8, B:50:0x00e2, B:51:0x00e5), top: B:99:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[Catch: all -> 0x015d, TryCatch #6 {all -> 0x015d, blocks: (B:61:0x012c, B:63:0x0132, B:70:0x0154, B:66:0x0141, B:69:0x014e, B:75:0x015f, B:77:0x0163, B:80:0x0174, B:81:0x0179), top: B:108:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f A[Catch: all -> 0x015d, TryCatch #6 {all -> 0x015d, blocks: (B:61:0x012c, B:63:0x0132, B:70:0x0154, B:66:0x0141, B:69:0x014e, B:75:0x015f, B:77:0x0163, B:80:0x0174, B:81:0x0179), top: B:108:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018e A[Catch: all -> 0x019d, TryCatch #5 {all -> 0x019d, blocks: (B:88:0x018a, B:90:0x018e, B:93:0x019f, B:94:0x01a7), top: B:107:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f A[Catch: all -> 0x019d, TryCatch #5 {all -> 0x019d, blocks: (B:88:0x018a, B:90:0x018e, B:93:0x019f, B:94:0x01a7), top: B:107:0x018a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(b9.h r20, m9.j r21, int r22, ec.c r23) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.h.a(b9.h, m9.j, int, ec.c):java.lang.Object");
    }

    public static void b(m9.e eVar, o9.a aVar, c cVar) {
        m9.j jVar = eVar.f9382b;
        if (aVar instanceof c9.l) {
            p9.f a10 = jVar.f9410h.a((c9.l) aVar, eVar);
            if (!(a10 instanceof p9.d)) {
                cVar.getClass();
                a10.a();
            }
        }
        cVar.getClass();
        m9.i iVar = jVar.f9406d;
        if (iVar != null) {
            iVar.a();
        }
    }
}
