package defpackage;

import com.github.junrar.unpack.decode.Compress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: am1  reason: default package */
/* loaded from: classes.dex */
public final class am1 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(e50.class, zw2.class, ha2.class, zy2.class, d57.class, gw3.class, i43.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final q61 j;
    public final List k;
    public final yl1 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(e50.class, new f50(0));
        hashMap.put(zw2.class, new f50(2));
        hashMap.put(ha2.class, new f50(1));
        hashMap.put(zy2.class, new f50(3));
        hashMap.put(d57.class, new f50(6));
        hashMap.put(gw3.class, new f50(5));
        hashMap.put(i43.class, new f50(4));
        q = Collections.unmodifiableMap(hashMap);
    }

    public am1(ArrayList arrayList, q61 q61Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = q61Var;
        this.k = arrayList2;
        yl1 yl1Var = new yl1(0);
        this.l = yl1Var;
        arrayList3.add(yl1Var);
        linkedHashSet.add(yl1Var);
    }

    public final void a(u uVar) {
        while (!h().b(uVar.d())) {
            e(h());
        }
        h().d().b(uVar.d());
        this.n.add(uVar);
        this.o.add(uVar);
    }

    public final void b(cs4 cs4Var) {
        tv3 tv3Var = cs4Var.b;
        tv3Var.a();
        ArrayList arrayList = tv3Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qv3 qv3Var = (qv3) obj;
            xr4 xr4Var = cs4Var.a;
            qv3Var.j();
            a21 a21Var = (a21) xr4Var.e;
            qv3Var.e = a21Var;
            if (a21Var != null) {
                a21Var.f = qv3Var;
            }
            qv3Var.f = xr4Var;
            xr4Var.e = qv3Var;
            a21 a21Var2 = (a21) xr4Var.b;
            qv3Var.b = a21Var2;
            if (((a21) qv3Var.e) == null) {
                a21Var2.c = qv3Var;
            }
            String str = qv3Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, qv3Var);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(this.b + 1, charSequence.length());
            int i = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            subSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        char charAt = this.a.charAt(this.b);
        int i = this.b;
        if (charAt == '\t') {
            this.b = i + 1;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
            return;
        }
        this.b = i + 1;
        this.c++;
    }

    public final void e(u uVar) {
        if (h() == uVar) {
            ArrayList arrayList = this.n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (uVar instanceof cs4) {
            b((cs4) uVar);
        }
        uVar.c();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((u) list.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i++;
                    i2++;
                }
            } else {
                i++;
                i2 += 4 - (i2 % 4);
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final u h() {
        ArrayList arrayList = this.n;
        return (u) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ca, code lost:
        if (r3 < 1) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cc, code lost:
        r3 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d2, code lost:
        if (r3 >= r13.length()) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d4, code lost:
        r6 = r13.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01da, code lost:
        if (r6 == '\t') goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01de, code lost:
        if (r6 == ' ') goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
        r6 = r13.subSequence(r8, r15).toString();
        r14 = new defpackage.a21();
        r14.h = java.lang.Integer.parseInt(r6);
        r14.i = r5;
        r5 = new defpackage.hw3(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0495, code lost:
        if (r5.length() == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x05ef, code lost:
        k(r22.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0185, code lost:
        if (r5.length() == 0) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0517  */
    /* JADX WARN: Type inference failed for: r14v19, types: [a21, gw3, ho4] */
    /* JADX WARN: Type inference failed for: r5v43, types: [a21, gw3, h90] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        boolean z;
        u uVar;
        int i;
        j50 j50Var;
        boolean z2;
        int i2;
        char charAt;
        int i3;
        ia2 ia2Var;
        j50 j50Var2;
        ax2 ax2Var;
        int i4;
        StringBuilder sb;
        StringBuilder sb2;
        int i5;
        int i6;
        hw3 hw3Var;
        char charAt2;
        hw3 hw3Var2;
        boolean z3;
        int i7;
        String str2 = str;
        int length = str2.length();
        int i8 = 0;
        StringBuilder sb3 = null;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt3 = str2.charAt(i9);
            if (charAt3 != 0) {
                if (sb3 != null) {
                    sb3.append(charAt3);
                }
            } else {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    sb3.append((CharSequence) str2, 0, i9);
                }
                sb3.append((char) 65533);
            }
        }
        if (sb3 != null) {
            str2 = sb3.toString();
        }
        this.a = str2;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i10 = 1;
        for (u uVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            b50 g = uVar2.g(this);
            if (g == null) {
                break;
            } else if (g.c) {
                e(uVar2);
                return;
            } else {
                int i11 = g.a;
                if (i11 != -1) {
                    k(i11);
                } else {
                    int i12 = g.b;
                    if (i12 != -1) {
                        j(i12);
                    }
                }
                i10++;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i10, arrayList.size()));
        u uVar3 = (u) arrayList.get(i10 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        if (!(uVar3.d() instanceof xr4) && !uVar3.e()) {
            z = false;
        } else {
            z = true;
        }
        while (true) {
            if (z) {
                g();
                if (!this.h) {
                    int i13 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        d51 d51Var = new d51(uVar3, 11);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i = i8;
                                char c = ' ';
                                switch (((f50) it.next()).a) {
                                    case 0:
                                        uVar = uVar3;
                                        int i14 = this.e;
                                        CharSequence charSequence = this.a;
                                        i2 = 4;
                                        if (this.g < 4 && i14 < charSequence.length() && charSequence.charAt(i14) == '>') {
                                            int i15 = this.c + this.g;
                                            int i16 = i15 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i17 = i14 + 1;
                                            if (i17 < charSequence2.length() && ((charAt = charSequence2.charAt(i17)) == '\t' || charAt == ' ')) {
                                                i16 = i15 + 2;
                                            }
                                            u[] uVarArr = new u[1];
                                            uVarArr[i] = new g50();
                                            j50Var = new j50(uVarArr);
                                            j50Var.b = i16;
                                            break;
                                        }
                                        j50Var = null;
                                        break;
                                    case 1:
                                        uVar = uVar3;
                                        int i18 = this.g;
                                        if (i18 < 4) {
                                            int i19 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i20 = i19;
                                            int i21 = i;
                                            int i22 = i21;
                                            while (true) {
                                                i3 = i19;
                                                if (i20 < length2) {
                                                    char charAt4 = charSequence3.charAt(i20);
                                                    if (charAt4 != '`') {
                                                        if (charAt4 == '~') {
                                                            i22++;
                                                        }
                                                    } else {
                                                        i21++;
                                                    }
                                                    i20++;
                                                    i19 = i3;
                                                }
                                            }
                                            int i23 = 3;
                                            if (i21 >= 3) {
                                                if (i22 == 0) {
                                                    int i24 = i3 + i21;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i24 < length3) {
                                                            if (charSequence3.charAt(i24) != '`') {
                                                                i24++;
                                                            }
                                                        } else {
                                                            i24 = -1;
                                                        }
                                                    }
                                                    if (i24 == -1) {
                                                        ia2Var = new ia2('`', i21, i18);
                                                        if (ia2Var != null) {
                                                            u[] uVarArr2 = new u[1];
                                                            uVarArr2[i] = ia2Var;
                                                            j50Var2 = new j50(uVarArr2);
                                                            j50Var2.a = i3 + ia2Var.a.h;
                                                            j50Var = j50Var2;
                                                            i2 = 4;
                                                            break;
                                                        }
                                                    }
                                                    ia2Var = null;
                                                    if (ia2Var != null) {
                                                    }
                                                } else {
                                                    i23 = 3;
                                                }
                                            }
                                            if (i22 >= i23 && i21 == 0) {
                                                ia2Var = new ia2('~', i22, i18);
                                                if (ia2Var != null) {
                                                }
                                            }
                                            ia2Var = null;
                                            if (ia2Var != null) {
                                            }
                                        }
                                        j50Var = null;
                                        i2 = 4;
                                    case 2:
                                        uVar = uVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.a;
                                            int i25 = this.e;
                                            int S = bl2.S('#', i25, charSequence4.length(), charSequence4) - i25;
                                            if (S != 0 && S <= 6) {
                                                int i26 = i25 + S;
                                                if (i26 >= charSequence4.length()) {
                                                    ax2Var = new ax2(S, "");
                                                } else {
                                                    char charAt5 = charSequence4.charAt(i26);
                                                    char c2 = ' ';
                                                    char c3 = '\t';
                                                    if (charAt5 == ' ' || charAt5 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 >= i26) {
                                                                char charAt6 = charSequence4.charAt(length4);
                                                                if (charAt6 == c3 || charAt6 == c2) {
                                                                    length4--;
                                                                    c2 = ' ';
                                                                    c3 = '\t';
                                                                }
                                                            } else {
                                                                length4 = i26 - 1;
                                                            }
                                                        }
                                                        int i27 = length4;
                                                        while (true) {
                                                            if (i27 < i26) {
                                                                i27 = i26 - 1;
                                                            } else if (charSequence4.charAt(i27) == '#') {
                                                                i27--;
                                                            }
                                                        }
                                                        int i28 = i27;
                                                        while (true) {
                                                            if (i28 >= i26) {
                                                                char charAt7 = charSequence4.charAt(i28);
                                                                if (charAt7 == '\t' || charAt7 == ' ') {
                                                                    i28--;
                                                                }
                                                            } else {
                                                                i28 = i26 - 1;
                                                            }
                                                        }
                                                        if (i28 != i27) {
                                                            ax2Var = new ax2(S, charSequence4.subSequence(i26, i28 + 1).toString());
                                                        } else {
                                                            ax2Var = new ax2(S, charSequence4.subSequence(i26, length4 + 1).toString());
                                                        }
                                                    }
                                                }
                                                if (ax2Var == null) {
                                                    u[] uVarArr3 = new u[1];
                                                    uVarArr3[i] = ax2Var;
                                                    j50Var2 = new j50(uVarArr3);
                                                    j50Var2.a = charSequence4.length();
                                                } else {
                                                    char charAt8 = charSequence4.charAt(i25);
                                                    if (charAt8 != '-') {
                                                        if (charAt8 == '=') {
                                                            if (bl2.T(charSequence4, bl2.S('=', i25 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                                i4 = 1;
                                                                if (i4 > 0) {
                                                                    u uVar4 = (u) d51Var.B;
                                                                    if (uVar4 instanceof cs4) {
                                                                        sb = ((cs4) uVar4).b.b;
                                                                        break;
                                                                    }
                                                                    sb = null;
                                                                    if (sb != null) {
                                                                        ax2 ax2Var2 = new ax2(i4, sb.toString());
                                                                        u[] uVarArr4 = new u[1];
                                                                        uVarArr4[i] = ax2Var2;
                                                                        j50Var2 = new j50(uVarArr4);
                                                                        j50Var2.a = charSequence4.length();
                                                                        j50Var2.c = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i4 = i;
                                                        if (i4 > 0) {
                                                        }
                                                    }
                                                    if (bl2.T(charSequence4, bl2.S('-', i25 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                        i4 = 2;
                                                        if (i4 > 0) {
                                                        }
                                                    }
                                                    i4 = i;
                                                    if (i4 > 0) {
                                                    }
                                                }
                                                j50Var = j50Var2;
                                                i2 = 4;
                                                break;
                                            }
                                            ax2Var = null;
                                            if (ax2Var == null) {
                                            }
                                            j50Var = j50Var2;
                                            i2 = 4;
                                        }
                                        j50Var = null;
                                        i2 = 4;
                                        break;
                                    case 3:
                                        uVar = uVar3;
                                        int i29 = i13;
                                        int i30 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < i29 && charSequence5.charAt(i30) == '<') {
                                            for (int i31 = 1; i31 <= 7; i31++) {
                                                if (i31 != 7 || !(((u) d51Var.B).d() instanceof xr4)) {
                                                    Pattern[] patternArr = az2.e[i31];
                                                    Pattern pattern = patternArr[i];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i30, charSequence5.length())).find()) {
                                                        u[] uVarArr5 = new u[1];
                                                        uVarArr5[i] = new az2(pattern2);
                                                        j50Var = new j50(uVarArr5);
                                                        j50Var.a = this.b;
                                                        i2 = 4;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        j50Var = null;
                                        i2 = 4;
                                        break;
                                    case 4:
                                        uVar = uVar3;
                                        i2 = 4;
                                        if (this.g >= 4) {
                                            if (!this.h && !(h().d() instanceof xr4)) {
                                                u[] uVarArr6 = new u[1];
                                                uVarArr6[i] = new ax2();
                                                j50Var = new j50(uVarArr6);
                                                i2 = 4;
                                                j50Var.b = this.c + 4;
                                                break;
                                            } else {
                                                i2 = 4;
                                            }
                                        }
                                        j50Var = null;
                                        break;
                                    case 5:
                                        u uVar5 = (u) d51Var.B;
                                        int i32 = this.g;
                                        if (i32 >= 4) {
                                            uVar = uVar3;
                                        } else {
                                            int i33 = this.e;
                                            int i34 = this.c + i32;
                                            if (uVar5 instanceof cs4) {
                                                sb2 = ((cs4) uVar5).b.b;
                                                break;
                                            }
                                            sb2 = null;
                                            if (sb2 != null) {
                                                i5 = 1;
                                            } else {
                                                i5 = i;
                                            }
                                            CharSequence charSequence6 = this.a;
                                            char charAt9 = charSequence6.charAt(i33);
                                            if (charAt9 != '*' && charAt9 != '+' && charAt9 != '-') {
                                                int length5 = charSequence6.length();
                                                int i35 = i33;
                                                int i36 = i;
                                                while (true) {
                                                    i6 = i5;
                                                    if (i35 < length5) {
                                                        char charAt10 = charSequence6.charAt(i35);
                                                        uVar = uVar3;
                                                        if (charAt10 != ')' && charAt10 != '.') {
                                                            switch (charAt10) {
                                                                case Compress.DC20 /* 48 */:
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i36++;
                                                                    if (i36 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i35++;
                                                                        i5 = i6;
                                                                        uVar3 = uVar;
                                                                    }
                                                            }
                                                        }
                                                    } else {
                                                        uVar = uVar3;
                                                    }
                                                }
                                                hw3Var = null;
                                                if (hw3Var != null) {
                                                }
                                                hw3Var2 = null;
                                                if (hw3Var2 != null) {
                                                }
                                            } else {
                                                i6 = i5;
                                                uVar = uVar3;
                                                int i37 = i33 + 1;
                                                if (i37 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i37)) == '\t' || charAt2 == ' ') {
                                                    ?? a21Var = new a21();
                                                    a21Var.h = charAt9;
                                                    hw3Var = new hw3(a21Var, i37);
                                                    if (hw3Var != null) {
                                                        gw3 gw3Var = hw3Var.a;
                                                        int i38 = hw3Var.b;
                                                        int i39 = (i38 - i33) + i34;
                                                        int length6 = charSequence6.length();
                                                        int i40 = i39;
                                                        while (true) {
                                                            if (i38 < length6) {
                                                                char charAt11 = charSequence6.charAt(i38);
                                                                if (charAt11 == '\t') {
                                                                    i40 = (4 - (i40 % 4)) + i40;
                                                                } else if (charAt11 == ' ') {
                                                                    i40++;
                                                                } else {
                                                                    i7 = 1;
                                                                }
                                                                i38++;
                                                            } else {
                                                                i7 = i;
                                                            }
                                                        }
                                                        if (i6 == 0 || ((!(gw3Var instanceof ho4) || ((ho4) gw3Var).h == 1) && i7 != 0)) {
                                                            if (i7 == 0 || i40 - i39 > 4) {
                                                                i40 = i39 + 1;
                                                            }
                                                            hw3Var2 = new hw3(gw3Var, i40);
                                                            if (hw3Var2 != null) {
                                                                gw3 gw3Var2 = hw3Var2.a;
                                                                int i41 = hw3Var2.b;
                                                                rw3 rw3Var = new rw3(i41 - this.c);
                                                                if (uVar5 instanceof iw3) {
                                                                    gw3 gw3Var3 = ((iw3) uVar5).a;
                                                                    if ((gw3Var3 instanceof h90) && (gw3Var2 instanceof h90)) {
                                                                        z3 = Character.valueOf(((h90) gw3Var3).h).equals(Character.valueOf(((h90) gw3Var2).h));
                                                                    } else if ((gw3Var3 instanceof ho4) && (gw3Var2 instanceof ho4)) {
                                                                        z3 = Character.valueOf(((ho4) gw3Var3).i).equals(Character.valueOf(((ho4) gw3Var2).i));
                                                                    } else {
                                                                        z3 = i;
                                                                    }
                                                                    if (z3 != 0) {
                                                                        u[] uVarArr7 = new u[1];
                                                                        uVarArr7[i] = rw3Var;
                                                                        j50 j50Var3 = new j50(uVarArr7);
                                                                        j50Var3.b = i41;
                                                                        j50Var = j50Var3;
                                                                        i2 = 4;
                                                                        break;
                                                                    }
                                                                }
                                                                iw3 iw3Var = new iw3(gw3Var2);
                                                                gw3Var2.g = true;
                                                                u[] uVarArr8 = new u[2];
                                                                uVarArr8[i] = iw3Var;
                                                                uVarArr8[1] = rw3Var;
                                                                j50 j50Var4 = new j50(uVarArr8);
                                                                j50Var4.b = i41;
                                                                j50Var = j50Var4;
                                                                i2 = 4;
                                                            }
                                                        }
                                                    }
                                                    hw3Var2 = null;
                                                    if (hw3Var2 != null) {
                                                    }
                                                }
                                                hw3Var = null;
                                                if (hw3Var != null) {
                                                }
                                                hw3Var2 = null;
                                                if (hw3Var2 != null) {
                                                }
                                            }
                                        }
                                        j50Var = null;
                                        i2 = 4;
                                        break;
                                    default:
                                        if (this.g < i13) {
                                            int i42 = this.e;
                                            CharSequence charSequence7 = this.a;
                                            int length7 = charSequence7.length();
                                            int i43 = i;
                                            int i44 = i43;
                                            int i45 = i44;
                                            while (true) {
                                                if (i42 < length7) {
                                                    char charAt12 = charSequence7.charAt(i42);
                                                    if (charAt12 != '\t' && charAt12 != c) {
                                                        if (charAt12 != '*') {
                                                            if (charAt12 != '-') {
                                                                if (charAt12 == '_') {
                                                                    i44++;
                                                                }
                                                            } else {
                                                                i43++;
                                                            }
                                                        } else {
                                                            i45++;
                                                        }
                                                    } else {
                                                        i44 = i44;
                                                        i45 = i45;
                                                    }
                                                    i42++;
                                                    c = ' ';
                                                } else {
                                                    int i46 = i44;
                                                    int i47 = i45;
                                                    if ((i43 >= 3 && i46 == 0 && i47 == 0) || ((i46 >= 3 && i43 == 0 && i47 == 0) || (i47 >= 3 && i43 == 0 && i46 == 0))) {
                                                        u[] uVarArr9 = new u[1];
                                                        uVarArr9[i] = new yl1(1);
                                                        j50Var = new j50(uVarArr9);
                                                        j50Var.a = charSequence7.length();
                                                    }
                                                }
                                            }
                                        }
                                        j50Var = null;
                                        uVar = uVar3;
                                        i2 = 4;
                                        break;
                                }
                                if (j50Var == null) {
                                    i13 = i2;
                                    i8 = i;
                                    uVar3 = uVar;
                                }
                            } else {
                                i = i8;
                                uVar = uVar3;
                                j50Var = null;
                            }
                        }
                        if (j50Var == null) {
                            k(this.e);
                        } else {
                            if (!isEmpty) {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i48 = j50Var.a;
                            if (i48 != -1) {
                                k(i48);
                            } else {
                                int i49 = j50Var.b;
                                if (i49 != -1) {
                                    j(i49);
                                }
                            }
                            if (j50Var.c) {
                                u h = h();
                                z2 = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.o.remove(h);
                                if (h instanceof cs4) {
                                    b((cs4) h);
                                }
                                h.d().j();
                            } else {
                                z2 = true;
                            }
                            u[] uVarArr10 = (u[]) j50Var.d;
                            int length8 = uVarArr10.length;
                            uVar3 = uVar;
                            for (int i50 = i; i50 < length8; i50++) {
                                uVar3 = uVarArr10[i50];
                                a(uVar3);
                                z = uVar3.e();
                            }
                            i8 = i;
                        }
                    }
                }
            } else {
                uVar = uVar3;
            }
        }
        if (!isEmpty && !this.h) {
            u h2 = h();
            h2.getClass();
            if (h2 instanceof cs4) {
                c();
                return;
            }
        }
        if (!isEmpty) {
            f(arrayList2);
        }
        if (!uVar.e()) {
            c();
        } else if (!this.h) {
            a(new cs4());
            c();
        }
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            }
            d();
        }
        if (i2 > i) {
            this.b--;
            this.c = i;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
