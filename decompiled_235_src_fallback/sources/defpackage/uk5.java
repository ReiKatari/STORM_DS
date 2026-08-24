package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk5  reason: default package */
/* loaded from: classes.dex */
public final class uk5 {
    public static final java.util.regex.Pattern x = null;
    public static final java.util.regex.Pattern y = null;
    public final defpackage.pa a;
    public final java.lang.reflect.Method b;
    public final java.lang.annotation.Annotation[] c;
    public final java.lang.annotation.Annotation[][] d;
    public final java.lang.reflect.Type[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public java.lang.String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public java.lang.String r;
    public defpackage.yw2 s;
    public defpackage.n34 t;
    public java.util.LinkedHashSet u;
    public defpackage.uj2[] v;
    public boolean w;

    static {
            java.lang.String r0 = "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.uk5.x = r0
            java.lang.String r0 = "[a-zA-Z][a-zA-Z0-9_-]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.uk5.y = r0
            return
    }

    public uk5(defpackage.pa r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.annotation.Annotation[] r1 = r2.getAnnotations()
            r0.c = r1
            java.lang.reflect.Type[] r1 = r2.getGenericParameterTypes()
            r0.e = r1
            java.lang.annotation.Annotation[][] r1 = r2.getParameterAnnotations()
            r0.d = r1
            return
    }

    public static java.lang.Class a(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L7
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r0 != r1) goto Le
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r0 != r1) goto L15
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r0 != r1) goto L1c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r0 != r1) goto L23
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r0 != r1) goto L2a
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r0 != r1) goto L31
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r0 != r1) goto L37
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
        L37:
            return r1
    }

    public final void b(java.lang.String r5, java.lang.String r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = r4.n
            r1 = 0
            java.lang.reflect.Method r2 = r4.b
            if (r0 != 0) goto L5c
            r4.n = r5
            r4.o = r7
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L12
            return
        L12:
            r5 = 63
            int r5 = r6.indexOf(r5)
            r7 = -1
            java.util.regex.Pattern r0 = defpackage.uk5.x
            r3 = 1
            if (r5 == r7) goto L40
            int r7 = r6.length()
            int r7 = r7 - r3
            if (r5 >= r7) goto L40
            int r5 = r5 + r3
            java.lang.String r5 = r6.substring(r5)
            java.util.regex.Matcher r7 = r0.matcher(r5)
            boolean r7 = r7.find()
            if (r7 != 0) goto L35
            goto L40
        L35:
            java.lang.String r4 = "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.IllegalArgumentException r4 = defpackage.ak7.o0(r2, r1, r4, r5)
            throw r4
        L40:
            r4.r = r6
            java.util.regex.Matcher r5 = r0.matcher(r6)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
        L4b:
            boolean r7 = r5.find()
            if (r7 == 0) goto L59
            java.lang.String r7 = r5.group(r3)
            r6.add(r7)
            goto L4b
        L59:
            r4.u = r6
            return
        L5c:
            java.lang.String r4 = "Only one HTTP method is allowed. Found: %s and %s."
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            java.lang.IllegalArgumentException r4 = defpackage.ak7.o0(r2, r1, r4, r5)
            throw r4
    }

    public final void c(int r2, java.lang.reflect.Type r3) {
            r1 = this;
            boolean r0 = defpackage.ak7.i0(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "Parameter type must not include a type variable or wildcard: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.reflect.Method r1 = r1.b
            java.lang.IllegalArgumentException r1 = defpackage.ak7.v0(r1, r2, r0, r3)
            throw r1
    }
}
