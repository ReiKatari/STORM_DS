package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.domain.model.Cheat;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey7  reason: default package */
/* loaded from: classes.dex */
public final class ey7 extends DefaultHandler {
    public final j97 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public wm0 o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public final StringBuilder w = new StringBuilder();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();

    public ey7(j97 j97Var) {
        this.a = j97Var;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.m && cArr != null) {
            this.w.append(cArr, 0, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        ((n36) ((eb) this.a.B).X).i(new lx3());
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        int i;
        boolean z;
        boolean z2 = this.b;
        j97 j97Var = this.a;
        StringBuilder sb = this.w;
        if (z2 && this.c) {
            String sb2 = sb.toString();
            Pattern compile = Pattern.compile("\\(.*?\\)");
            compile.getClass();
            String replaceAll = compile.matcher(sb2).replaceAll("");
            replaceAll.getClass();
            String obj = qs6.T0(replaceAll).toString();
            this.n = obj;
            this.c = false;
            obj.getClass();
            j97Var.getClass();
            this.o = (wm0) hv.V(vt1.A, new z((CheatImportWorker) ((eb) j97Var.B).B, obj, null, 16));
        }
        if (this.d) {
            if (this.e) {
                String sb3 = sb.toString();
                this.p = sb3;
                this.e = false;
                j97Var.getClass();
                eb ebVar = (eb) j97Var.B;
                CheatImportWorker cheatImportWorker = (CheatImportWorker) ebVar.B;
                Long l = (Long) ebVar.L;
                if (l != null) {
                    i = (int) ((((g45) ebVar.R).A / l.longValue()) * 100.0d);
                } else {
                    i = 0;
                }
                if (l == null) {
                    z = true;
                } else {
                    z = false;
                }
                cheatImportWorker.b(cheatImportWorker.g(sb3, i, z));
                vr4[] vr4VarArr = {new vr4("progress_relative", Float.valueOf(i / 100.0f)), new vr4("progress_item", sb3)};
                wb1 wb1Var = new wb1(0, (byte) 0);
                for (int i2 = 0; i2 < 2; i2++) {
                    vr4 vr4Var = vr4VarArr[i2];
                    wb1Var.h(vr4Var.B, (String) vr4Var.A);
                }
                cheatImportWorker.c(wb1Var.e());
            }
            if (this.f) {
                List J0 = qs6.J0(sb.toString(), new char[]{' '}, 6);
                this.q = (String) J0.get(0);
                this.r = (String) J0.get(1);
                this.f = false;
            }
            if (this.g && this.h) {
                this.s = sb.toString();
                this.h = false;
            }
            if (this.i && this.j) {
                this.t = sb.toString();
                this.j = false;
            }
            if (this.i && this.k) {
                String sb4 = sb.toString();
                if (!qs6.v0(sb4)) {
                    this.u = sb4;
                }
                this.k = false;
            }
            if (this.i && this.l) {
                this.v = sb.toString();
                this.l = false;
            }
            this.m = false;
        }
        boolean z3 = this.i;
        ArrayList arrayList = this.x;
        if (z3 && nb3.k(str3, "cheat")) {
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            wm0 wm0Var = this.o;
            wm0Var.getClass();
            long longValue = wm0Var.a.longValue();
            String str4 = this.t;
            str4.getClass();
            String str5 = this.u;
            String str6 = this.v;
            str6.getClass();
            arrayList.add(new Cheat(null, longValue, str4, str5, str6, false));
            this.t = null;
            this.u = null;
            this.v = null;
            return;
        }
        boolean z4 = this.g;
        ArrayList arrayList2 = this.y;
        if (z4 && nb3.k(str3, "folder")) {
            this.g = false;
            this.h = false;
            if (!arrayList.isEmpty()) {
                String str7 = this.s;
                str7.getClass();
                arrayList2.add(new an0(null, str7, new ArrayList(arrayList)));
            }
            this.s = null;
            arrayList.clear();
        } else if (this.d && nb3.k(str3, "game")) {
            this.d = false;
            this.e = false;
            if (!arrayList2.isEmpty()) {
                String str8 = this.p;
                str8.getClass();
                String str9 = this.q;
                str9.getClass();
                String str10 = this.r;
                str10.getClass();
                cp2 cp2Var = new cp2(null, str8, str9, str10, new ArrayList(arrayList2));
                j97Var.getClass();
                hv.V(vt1.A, new z((CheatImportWorker) ((eb) j97Var.B).B, cp2Var, null, 17));
            }
            arrayList2.clear();
            this.p = null;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        boolean z = this.b;
        if (!z) {
            if (nb3.k(str3, "codelist")) {
                this.b = true;
                return;
            }
            return;
        }
        if (z && this.n == null && nb3.k(str3, "name")) {
            this.c = true;
            this.m = true;
        }
        boolean z2 = this.d;
        if (!z2) {
            if (nb3.k(str3, "game")) {
                this.d = true;
                return;
            }
            return;
        }
        if (z2 && this.p == null && nb3.k(str3, "name")) {
            this.e = true;
            this.m = true;
        }
        if (this.d && !this.f && nb3.k(str3, "gameid")) {
            this.f = true;
            this.m = true;
        }
        if (!this.g && nb3.k(str3, "folder")) {
            this.g = true;
            this.m = true;
        }
        if (this.g && this.s == null && nb3.k(str3, "name")) {
            this.h = true;
            this.m = true;
        }
        if (this.g && !this.i && nb3.k(str3, "cheat")) {
            this.i = true;
            this.m = true;
        }
        if (this.i && this.t == null && nb3.k(str3, "name")) {
            this.j = true;
            this.m = true;
        }
        if (this.i && this.u == null && nb3.k(str3, "note")) {
            this.k = true;
            this.m = true;
        }
        if (this.i && this.v == null && nb3.k(str3, "codes")) {
            this.l = true;
            this.m = true;
        }
        if (this.m) {
            StringBuilder sb = this.w;
            sb.getClass();
            sb.setLength(0);
        }
    }
}
