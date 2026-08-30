package kf;

import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.domain.model.Cheat;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e2 extends DefaultHandler {

    /* renamed from: a  reason: collision with root package name */
    public final rd.k f8187a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8188b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8189c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8190d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8191e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8192f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8193g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8194h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8195i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8196j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8197k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8198l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public String f8199n;

    /* renamed from: o  reason: collision with root package name */
    public oe.b f8200o;

    /* renamed from: p  reason: collision with root package name */
    public String f8201p;

    /* renamed from: q  reason: collision with root package name */
    public String f8202q;

    /* renamed from: r  reason: collision with root package name */
    public String f8203r;

    /* renamed from: s  reason: collision with root package name */
    public String f8204s;

    /* renamed from: t  reason: collision with root package name */
    public String f8205t;

    /* renamed from: u  reason: collision with root package name */
    public String f8206u;

    /* renamed from: v  reason: collision with root package name */
    public String f8207v;

    /* renamed from: w  reason: collision with root package name */
    public final StringBuilder f8208w = new StringBuilder();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f8209x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f8210y = new ArrayList();

    public e2(rd.k kVar) {
        this.f8187a = kVar;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i2, int i10) {
        if (this.m && cArr != null) {
            this.f8208w.append(cArr, 0, i10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        ((cc.i) ((b9.e) this.f8187a.B).X).h(new p8.s());
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        int i2;
        boolean z10;
        boolean z11 = this.f8188b;
        cc.h hVar = cc.h.A;
        rd.k kVar = this.f8187a;
        StringBuilder sb2 = this.f8208w;
        if (z11 && this.f8189c) {
            String sb3 = sb2.toString();
            Pattern compile = Pattern.compile("\\(.*?\\)");
            compile.getClass();
            String replaceAll = compile.matcher(sb3).replaceAll("");
            replaceAll.getClass();
            String obj = vc.h.C0(replaceAll).toString();
            this.f8199n = obj;
            this.f8189c = false;
            obj.getClass();
            kVar.getClass();
            this.f8200o = (oe.b) zc.x.z(hVar, new a5.o((CheatImportWorker) ((b9.e) kVar.B).B, obj, null, 28));
        }
        if (this.f8190d) {
            if (this.f8191e) {
                String sb4 = sb2.toString();
                this.f8201p = sb4;
                this.f8191e = false;
                kVar.getClass();
                b9.e eVar = (b9.e) kVar.B;
                CheatImportWorker cheatImportWorker = (CheatImportWorker) eVar.B;
                WorkerParameters workerParameters = cheatImportWorker.f11504b;
                Long l10 = (Long) eVar.L;
                if (l10 != null) {
                    i2 = (int) ((((ud.a) eVar.R).A / l10.longValue()) * 100);
                } else {
                    i2 = 0;
                }
                if (l10 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p8.m e6 = cheatImportWorker.e(sb4, i2, z10);
                y8.n nVar = workerParameters.f1721h;
                p7.k.k(nVar.f14803a.f14969a, "setForegroundAsync", new ai.z(nVar, workerParameters.f1714a, e6, cheatImportWorker.f11503a, 2));
                yb.j[] jVarArr = {new yb.j("progress_relative", Float.valueOf(i2 / 100.0f)), new yb.j("progress_item", sb4)};
                ah.m1 m1Var = new ah.m1(5, (byte) 0);
                for (int i10 = 0; i10 < 2; i10++) {
                    yb.j jVar = jVarArr[i10];
                    m1Var.h(jVar.B, (String) jVar.A);
                }
                p8.h f8 = m1Var.f();
                y8.o oVar = workerParameters.f1720g;
                p7.k.k(oVar.f14808b.f14969a, "updateProgress", new ai.p(oVar, workerParameters.f1714a, f8, 15));
            }
            if (this.f8192f) {
                List u02 = vc.h.u0(sb2.toString(), new char[]{' '});
                this.f8202q = (String) u02.get(0);
                this.f8203r = (String) u02.get(1);
                this.f8192f = false;
            }
            if (this.f8193g && this.f8194h) {
                this.f8204s = sb2.toString();
                this.f8194h = false;
            }
            if (this.f8195i && this.f8196j) {
                this.f8205t = sb2.toString();
                this.f8196j = false;
            }
            if (this.f8195i && this.f8197k) {
                String sb5 = sb2.toString();
                if (!vc.h.j0(sb5)) {
                    this.f8206u = sb5;
                }
                this.f8197k = false;
            }
            if (this.f8195i && this.f8198l) {
                this.f8207v = sb2.toString();
                this.f8198l = false;
            }
            this.m = false;
        }
        boolean z12 = this.f8195i;
        ArrayList arrayList = this.f8209x;
        if (z12 && nc.k.a(str3, "cheat")) {
            this.f8195i = false;
            this.f8196j = false;
            this.f8197k = false;
            this.f8198l = false;
            oe.b bVar = this.f8200o;
            bVar.getClass();
            long longValue = bVar.f10910a.longValue();
            String str4 = this.f8205t;
            str4.getClass();
            String str5 = this.f8206u;
            String str6 = this.f8207v;
            str6.getClass();
            arrayList.add(new Cheat(null, longValue, str4, str5, str6, false));
            this.f8205t = null;
            this.f8206u = null;
            this.f8207v = null;
            return;
        }
        boolean z13 = this.f8193g;
        ArrayList arrayList2 = this.f8210y;
        if (z13 && nc.k.a(str3, "folder")) {
            this.f8193g = false;
            this.f8194h = false;
            if (!arrayList.isEmpty()) {
                String str7 = this.f8204s;
                str7.getClass();
                arrayList2.add(new oe.c(null, str7, new ArrayList(arrayList)));
            }
            this.f8204s = null;
            arrayList.clear();
        } else if (this.f8190d && nc.k.a(str3, "game")) {
            this.f8190d = false;
            this.f8191e = false;
            if (!arrayList2.isEmpty()) {
                String str8 = this.f8201p;
                str8.getClass();
                String str9 = this.f8202q;
                str9.getClass();
                String str10 = this.f8203r;
                str10.getClass();
                oe.q qVar = new oe.q(null, str8, str9, str10, new ArrayList(arrayList2));
                kVar.getClass();
                zc.x.z(hVar, new a5.o((CheatImportWorker) ((b9.e) kVar.B).B, qVar, null, 29));
            }
            arrayList2.clear();
            this.f8201p = null;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        boolean z10 = this.f8188b;
        if (!z10) {
            if (nc.k.a(str3, "codelist")) {
                this.f8188b = true;
                return;
            }
            return;
        }
        if (z10 && this.f8199n == null && nc.k.a(str3, "name")) {
            this.f8189c = true;
            this.m = true;
        }
        boolean z11 = this.f8190d;
        if (!z11) {
            if (nc.k.a(str3, "game")) {
                this.f8190d = true;
                return;
            }
            return;
        }
        if (z11 && this.f8201p == null && nc.k.a(str3, "name")) {
            this.f8191e = true;
            this.m = true;
        }
        if (this.f8190d && !this.f8192f && nc.k.a(str3, "gameid")) {
            this.f8192f = true;
            this.m = true;
        }
        if (!this.f8193g && nc.k.a(str3, "folder")) {
            this.f8193g = true;
            this.m = true;
        }
        if (this.f8193g && this.f8204s == null && nc.k.a(str3, "name")) {
            this.f8194h = true;
            this.m = true;
        }
        if (this.f8193g && !this.f8195i && nc.k.a(str3, "cheat")) {
            this.f8195i = true;
            this.m = true;
        }
        if (this.f8195i && this.f8205t == null && nc.k.a(str3, "name")) {
            this.f8196j = true;
            this.m = true;
        }
        if (this.f8195i && this.f8206u == null && nc.k.a(str3, "note")) {
            this.f8197k = true;
            this.m = true;
        }
        if (this.f8195i && this.f8207v == null && nc.k.a(str3, "codes")) {
            this.f8198l = true;
            this.m = true;
        }
        if (this.m) {
            StringBuilder sb2 = this.f8208w;
            sb2.getClass();
            sb2.setLength(0);
        }
    }
}
