package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f10479e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f10480f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f10481a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f10482b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f10483c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10484d;

    static {
        Class[] clsArr = {Context.class};
        f10479e = clsArr;
        f10480f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f10483c = context;
        Object[] objArr = {context};
        this.f10481a = objArr;
        this.f10482b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r9 = false;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r9 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r3 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r3 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r3 == 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        r8 = r17;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3.equals(r11) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        r8 = r17;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r3.equals("group") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        r2.f10455b = 0;
        r2.f10456c = 0;
        r2.f10457d = 0;
        r2.f10458e = 0;
        r2.f10459f = true;
        r2.f10460g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r3.equals("item") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r2.f10461h != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        r3 = r2.f10478z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r3.f11159b.hasSubMenu() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        r2.f10461h = true;
        r2.b(r2.f10454a.addSubMenu(r2.f10455b, r2.f10462i, r2.f10463j, r2.f10464k).getItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        r2.f10461h = true;
        r2.b(r2.f10454a.add(r2.f10455b, r2.f10462i, r2.f10463j, r2.f10464k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (r3.equals("menu") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        r8 = r17;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
        if (r10 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        r3 = r17.getName();
        r13 = r3.equals("group");
        r15 = r16.f10483c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
        if (r13 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        r3 = r15.obtainStyledAttributes(r18, k.a.f7925p);
        r2.f10455b = r3.getResourceId(1, 0);
        r2.f10456c = r3.getInt(3, 0);
        r2.f10457d = r3.getInt(4, 0);
        r2.f10458e = r3.getInt(5, 0);
        r2.f10459f = r3.getBoolean(2, true);
        r2.f10460g = r3.getBoolean(0, true);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
        if (r3.equals("item") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
        r3 = r15.obtainStyledAttributes(r18, k.a.f7926q);
        r2.f10462i = r3.getResourceId(2, 0);
        r2.f10463j = (r3.getInt(5, r2.f10456c) & (-65536)) | (r3.getInt(6, r2.f10457d) & 65535);
        r2.f10464k = r3.getText(7);
        r2.f10465l = r3.getText(8);
        r2.m = r3.getResourceId(0, 0);
        r8 = r3.getString(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
        if (r8 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
        r8 = r8.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014b, code lost:
        r2.f10466n = r8;
        r2.f10467o = r3.getInt(16, 4096);
        r8 = r3.getString(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015d, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
        r8 = r8.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0165, code lost:
        r2.f10468p = r8;
        r2.f10469q = r3.getInt(20, 4096);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0175, code lost:
        if (r3.hasValue(11) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0177, code lost:
        r2.f10470r = r3.getBoolean(11, false) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017e, code lost:
        r2.f10470r = r2.f10458e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
        r2.f10471s = r3.getBoolean(3, false);
        r2.f10472t = r3.getBoolean(4, r2.f10459f);
        r2.f10473u = r3.getBoolean(1, r2.f10460g);
        r2.f10474v = r3.getInt(21, -1);
        r2.f10477y = r3.getString(12);
        r2.f10475w = r3.getResourceId(13, 0);
        r2.f10476x = r3.getString(15);
        r5 = r3.getString(14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bf, code lost:
        if (r5 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c1, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c3, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c4, code lost:
        if (r12 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c8, code lost:
        if (r2.f10475w != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cc, code lost:
        if (r2.f10476x != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ce, code lost:
        r2.f10478z = (p.o) r2.a(r5, o.h.f10480f, r16.f10482b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
        if (r12 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01dd, code lost:
        android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e4, code lost:
        r2.f10478z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e7, code lost:
        r2.A = r3.getText(17);
        r2.B = r3.getText(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fd, code lost:
        if (r3.hasValue(19) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ff, code lost:
        r2.D = q.l1.c(r3.getInt(19, -1), r2.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
        r2.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0215, code lost:
        if (r3.hasValue(18) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021b, code lost:
        if (r3.hasValue(18) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021d, code lost:
        r8 = r3.getResourceId(18, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0221, code lost:
        if (r8 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
        r8 = aj.g.z(r15, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0227, code lost:
        if (r8 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022a, code lost:
        r8 = r3.getColorStateList(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022e, code lost:
        r2.C = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0232, code lost:
        r2.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0235, code lost:
        r3.recycle();
        r2.f10461h = false;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0242, code lost:
        if (r3.equals("menu") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0244, code lost:
        r2.f10461h = true;
        r3 = r2.f10454a.addSubMenu(r2.f10455b, r2.f10462i, r2.f10463j, r2.f10464k);
        r2.b(r3.getItem());
        r8 = r17;
        b(r8, r18, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0261, code lost:
        r8 = r17;
        r11 = r3;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0265, code lost:
        r3 = r8.next();
        r5 = 2;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x026c, code lost:
        m9.o.r("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0271, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof p.l)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f10483c.getResources().getLayout(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof p.l) {
                    p.l lVar = (p.l) menu;
                    if (!lVar.f11124p) {
                        lVar.w();
                        z10 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((p.l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((p.l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
