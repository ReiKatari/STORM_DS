package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.domain.model.Cheat;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jj7  reason: default package */
/* loaded from: classes.dex */
public final class jj7 extends DefaultHandler {
    public final u57 a;
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
    public nk0 o;
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

    public jj7(u57 u57Var) {
        this.a = u57Var;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.m && cArr != null) {
            this.w.append(cArr, 0, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        ((rs5) ((q9) this.a.B).X).k(new kq3());
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        int i;
        boolean z;
        boolean z2 = this.b;
        u57 u57Var = this.a;
        StringBuilder sb = this.w;
        if (z2 && this.c) {
            String sb2 = sb.toString();
            Pattern compile = Pattern.compile("\\(.*?\\)");
            compile.getClass();
            String replaceAll = compile.matcher(sb2).replaceAll("");
            replaceAll.getClass();
            String obj = zg6.Z0(replaceAll).toString();
            this.n = obj;
            this.c = false;
            obj.getClass();
            u57Var.getClass();
            this.o = (nk0) tq5.A(mp1.A, new y((CheatImportWorker) ((q9) u57Var.B).B, obj, null, 16));
        }
        if (this.d) {
            if (this.e) {
                String sb3 = sb.toString();
                this.p = sb3;
                this.e = false;
                u57Var.getClass();
                q9 q9Var = (q9) u57Var.B;
                CheatImportWorker cheatImportWorker = (CheatImportWorker) q9Var.B;
                Long l = (Long) q9Var.L;
                if (l != null) {
                    i = (int) ((((zu4) q9Var.R).A / l.longValue()) * 100.0d);
                } else {
                    i = 0;
                }
                if (l == null) {
                    z = true;
                } else {
                    z = false;
                }
                cheatImportWorker.b(cheatImportWorker.g(sb3, i, z));
                ti4[] ti4VarArr = {new ti4("progress_relative", Float.valueOf(i / 100.0f)), new ti4("progress_item", sb3)};
                e81 e81Var = new e81(0, (byte) 0);
                for (int i2 = 0; i2 < 2; i2++) {
                    ti4 ti4Var = ti4VarArr[i2];
                    e81Var.h(ti4Var.B, (String) ti4Var.A);
                }
                cheatImportWorker.c(e81Var.e());
            }
            if (this.f) {
                List P0 = zg6.P0(sb.toString(), new char[]{' '}, 6);
                this.q = (String) P0.get(0);
                this.r = (String) P0.get(1);
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
                if (!zg6.B0(sb4)) {
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
        if (z3 && b53.x(str3, "cheat")) {
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            nk0 nk0Var = this.o;
            nk0Var.getClass();
            long longValue = nk0Var.a.longValue();
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
        if (z4 && b53.x(str3, "folder")) {
            this.g = false;
            this.h = false;
            if (!arrayList.isEmpty()) {
                String str7 = this.s;
                str7.getClass();
                arrayList2.add(new sk0(null, str7, new ArrayList(arrayList)));
            }
            this.s = null;
            arrayList.clear();
        } else if (this.d && b53.x(str3, "game")) {
            this.d = false;
            this.e = false;
            if (!arrayList2.isEmpty()) {
                String str8 = this.p;
                str8.getClass();
                String str9 = this.q;
                str9.getClass();
                String str10 = this.r;
                str10.getClass();
                yj2 yj2Var = new yj2(null, str8, str9, str10, new ArrayList(arrayList2));
                u57Var.getClass();
                tq5.A(mp1.A, new y((CheatImportWorker) ((q9) u57Var.B).B, yj2Var, null, 17));
            }
            arrayList2.clear();
            this.p = null;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        boolean z = this.b;
        if (!z) {
            if (b53.x(str3, "codelist")) {
                this.b = true;
                return;
            }
            return;
        }
        if (z && this.n == null && b53.x(str3, "name")) {
            this.c = true;
            this.m = true;
        }
        boolean z2 = this.d;
        if (!z2) {
            if (b53.x(str3, "game")) {
                this.d = true;
                return;
            }
            return;
        }
        if (z2 && this.p == null && b53.x(str3, "name")) {
            this.e = true;
            this.m = true;
        }
        if (this.d && !this.f && b53.x(str3, "gameid")) {
            this.f = true;
            this.m = true;
        }
        if (!this.g && b53.x(str3, "folder")) {
            this.g = true;
            this.m = true;
        }
        if (this.g && this.s == null && b53.x(str3, "name")) {
            this.h = true;
            this.m = true;
        }
        if (this.g && !this.i && b53.x(str3, "cheat")) {
            this.i = true;
            this.m = true;
        }
        if (this.i && this.t == null && b53.x(str3, "name")) {
            this.j = true;
            this.m = true;
        }
        if (this.i && this.u == null && b53.x(str3, "note")) {
            this.k = true;
            this.m = true;
        }
        if (this.i && this.v == null && b53.x(str3, "codes")) {
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
