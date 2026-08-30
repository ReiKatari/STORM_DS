package ai;

import android.content.Intent;
import android.net.Uri;
import g2.k1;
import g2.l1;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.l B;

    public /* synthetic */ w(mc.l lVar, int i2) {
        this.A = i2;
        this.B = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        UUID uuid;
        String stringExtra;
        switch (this.A) {
            case 0:
                this.B.k(new zh.l((zh.r) ((fc.b) zh.r.getEntries()).get(((Integer) obj).intValue())));
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                mc.l lVar = this.B;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    lVar.k(new zh.j(uri));
                }
                return yb.y.f14813a;
            case 2:
                mc.l lVar2 = this.B;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    lVar2.k(new zh.k(uri2));
                }
                return yb.y.f14813a;
            case 3:
                mc.l lVar3 = this.B;
                String str = (String) obj;
                str.getClass();
                if (vc.h.j0(str)) {
                    str = null;
                }
                lVar3.k(new zh.i(str));
                return yb.y.f14813a;
            case 4:
                this.B.k(new zh.n((af.f) ((fc.b) af.f.getEntries()).get(((Integer) obj).intValue())));
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                this.B.k(new zh.o((af.h) ((fc.b) af.h.getEntries()).get(((Integer) obj).intValue())));
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                mc.l lVar4 = this.B;
                h.a aVar = (h.a) obj;
                aVar.getClass();
                if (aVar.A == -1) {
                    Intent intent = aVar.B;
                    if (intent != null && (stringExtra = intent.getStringExtra("selected_layout_id")) != null) {
                        uuid = UUID.fromString(stringExtra);
                    } else {
                        uuid = null;
                    }
                    lVar4.k(new zh.m(uuid));
                }
                return yb.y.f14813a;
            case 7:
                mc.l lVar5 = this.B;
                Long l10 = (Long) obj;
                l10.getClass();
                return lVar5.k(l10);
            case 8:
                return new k1((l1) obj, this.B);
            case l1.c.f8508d /* 9 */:
                mc.l lVar6 = this.B;
                oe.a aVar2 = (oe.a) obj;
                aVar2.getClass();
                lVar6.k(aVar2);
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                mc.l lVar7 = this.B;
                String str2 = (String) obj;
                str2.getClass();
                lVar7.k(str2);
                return yb.y.f14813a;
            case 11:
                this.B.k(((fc.b) ve.a.getEntries()).get(((Integer) obj).intValue()));
                return yb.y.f14813a;
            case 12:
                this.B.k(Integer.valueOf(Integer.parseInt((String) obj)));
                return yb.y.f14813a;
            default:
                z2.f fVar = (z2.f) this.B.k((z2.j) obj);
                synchronized (z2.l.f14919c) {
                    z2.l.f14920d = z2.l.f14920d.e(fVar.g());
                }
                return fVar;
        }
    }
}
