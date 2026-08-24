package defpackage;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku6  reason: default package */
/* loaded from: classes.dex */
public final class ku6 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public ku6(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
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
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        r15 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r3 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r3 == 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        r8 = r17;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r3.equals(r11) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r8 = r17;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r3.equals("group") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        r2.b = 0;
        r2.c = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = true;
        r2.g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r3.equals("item") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r2.h != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        r3 = r2.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r3.b.hasSubMenu() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        r2.h = true;
        r2.b(r15.addSubMenu(r2.b, r2.i, r2.j, r2.k).getItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        r2.h = true;
        r2.b(r15.add(r2.b, r2.i, r2.j, r2.k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r3.equals("menu") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r8 = r17;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r10 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        r3 = r17.getName();
        r13 = r3.equals("group");
        r8 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r13 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
        r3 = r8.obtainStyledAttributes(r18, defpackage.m75.p);
        r2.b = r3.getResourceId(1, 0);
        r2.c = r3.getInt(3, 0);
        r2.d = r3.getInt(4, 0);
        r2.e = r3.getInt(5, 0);
        r2.f = r3.getBoolean(2, true);
        r2.g = r3.getBoolean(0, true);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
        if (r3.equals("item") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
        r3 = r8.obtainStyledAttributes(r18, defpackage.m75.q);
        r2.i = r3.getResourceId(2, 0);
        r2.j = (r3.getInt(5, r2.c) & (-65536)) | (r3.getInt(6, r2.d) & 65535);
        r2.k = r3.getText(7);
        r2.l = r3.getText(8);
        r2.m = r3.getResourceId(0, 0);
        r12 = r3.getString(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
        if (r12 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0146, code lost:
        r12 = r12.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
        r2.n = r12;
        r2.o = r3.getInt(16, 4096);
        r12 = r3.getString(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015c, code lost:
        if (r12 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0160, code lost:
        r12 = r12.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
        r2.p = r12;
        r2.q = r3.getInt(20, 4096);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0174, code lost:
        if (r3.hasValue(11) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0176, code lost:
        r2.r = r3.getBoolean(11, false) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017d, code lost:
        r2.r = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0181, code lost:
        r2.s = r3.getBoolean(3, false);
        r2.t = r3.getBoolean(4, r2.f);
        r2.u = r3.getBoolean(1, r2.g);
        r2.v = r3.getInt(21, -1);
        r2.y = r3.getString(12);
        r2.w = r3.getResourceId(13, 0);
        r2.x = r3.getString(15);
        r5 = r3.getString(14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
        if (r5 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c0, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c2, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c3, code lost:
        if (r13 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c7, code lost:
        if (r2.w != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cb, code lost:
        if (r2.x != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cd, code lost:
        r2.z = (defpackage.p44) r2.a(r5, defpackage.ku6.f, r16.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
        if (r13 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01dc, code lost:
        android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e3, code lost:
        r2.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e6, code lost:
        r2.A = r3.getText(17);
        r2.B = r3.getText(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
        if (r3.hasValue(19) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fe, code lost:
        r2.D = defpackage.bp1.c(r3.getInt(19, -1), r2.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020b, code lost:
        r2.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0214, code lost:
        if (r3.hasValue(18) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
        if (r3.hasValue(18) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021c, code lost:
        r12 = r3.getResourceId(18, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0220, code lost:
        if (r12 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0222, code lost:
        r8 = defpackage.ge7.A(r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0226, code lost:
        if (r8 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
        r8 = r3.getColorStateList(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022d, code lost:
        r2.C = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0231, code lost:
        r2.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0234, code lost:
        r3.recycle();
        r2.h = false;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0241, code lost:
        if (r3.equals("menu") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0243, code lost:
        r2.h = true;
        r3 = r15.addSubMenu(r2.b, r2.i, r2.j, r2.k);
        r2.b(r3.getItem());
        r8 = r17;
        b(r8, r18, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025e, code lost:
        r8 = r17;
        r11 = r3;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0262, code lost:
        r3 = r8.next();
        r5 = 2;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0269, code lost:
        defpackage.u34.j("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        ju6 ju6Var = new ju6(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            int i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    u34.j("Expecting menu, got ".concat(name));
                    return;
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i44)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof i44) {
                    i44 i44Var = (i44) menu;
                    if (!i44Var.p) {
                        i44Var.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((i44) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((i44) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
