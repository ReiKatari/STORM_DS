package zb;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import oe.f0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ a(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        String valueOf;
        Object kVar;
        String str;
        String str2;
        BufferedInputStream bufferedInputStream;
        switch (this.A) {
            case 0:
                if (obj == ((b) this.B)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case DSiCameraSource.FrontCamera /* 1 */:
                s2.b bVar = (s2.b) this.B;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                String str3 = "(this Map)";
                if (key == bVar) {
                    valueOf = "(this Map)";
                } else {
                    valueOf = String.valueOf(key);
                }
                sb2.append(valueOf);
                sb2.append('=');
                Object value = entry.getValue();
                if (value != bVar) {
                    str3 = String.valueOf(value);
                }
                sb2.append(str3);
                return sb2.toString();
            case 2:
                zf.d dVar = (zf.d) this.B;
                bg.b bVar2 = (bg.b) obj;
                bVar2.getClass();
                String str4 = null;
                try {
                    InputStream openInputStream = dVar.f15070b.getContentResolver().openInputStream(bVar2.o());
                    if (openInputStream != null) {
                        if (openInputStream instanceof BufferedInputStream) {
                            bufferedInputStream = (BufferedInputStream) openInputStream;
                        } else {
                            bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                        }
                        kVar = a.a.H(bufferedInputStream);
                        openInputStream.close();
                    } else {
                        kVar = null;
                    }
                } catch (Throwable th2) {
                    kVar = new yb.k(th2);
                }
                if (kVar instanceof yb.k) {
                    kVar = null;
                }
                f0 f0Var = (f0) kVar;
                if (f0Var == null) {
                    return null;
                }
                String m = bVar2.m();
                String str5 = f0Var.f10930b;
                String k10 = bVar2.k();
                String uri = bVar2.o().toString();
                uri.getClass();
                String uri2 = bVar2.n().toString();
                uri2.getClass();
                af.f m10 = bVar2.j().m();
                af.h n10 = bVar2.j().n();
                UUID k11 = bVar2.j().k();
                if (k11 != null) {
                    str = k11.toString();
                } else {
                    str = null;
                }
                boolean l10 = bVar2.j().l();
                Uri i2 = bVar2.j().i();
                if (i2 != null) {
                    str2 = i2.toString();
                } else {
                    str2 = null;
                }
                Uri j2 = bVar2.j().j();
                if (j2 != null) {
                    str4 = j2.toString();
                }
                return new bg.f(m, str5, k10, uri, uri2, new bg.d(m10, n10, str, l10, str2, str4), bVar2.l(), f0Var.f10931c, f0Var.f10932d);
            default:
                xg.h hVar = (xg.h) this.B;
                Uri uri3 = (Uri) obj;
                if (uri3 != null) {
                    hVar.e(uri3);
                }
                return y.f14813a;
        }
    }
}
