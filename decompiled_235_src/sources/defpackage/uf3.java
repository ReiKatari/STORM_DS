package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf3  reason: default package */
/* loaded from: classes.dex */
public final class uf3 implements rh4, mk7 {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final qh4 e;
    public final boolean f;

    public uf3(Writer writer, Map map, Map map2, qh4 qh4Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = qh4Var;
        this.f = z;
    }

    public final uf3 a(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                c();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    c();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    a(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    a(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                a(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    b(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            qh4 qh4Var = (qh4) this.c.get(obj.getClass());
            if (qh4Var != null) {
                jsonWriter.beginObject();
                qh4Var.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            lk7 lk7Var = (lk7) this.d.get(obj.getClass());
            if (lk7Var != null) {
                lk7Var.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                c();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.e.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
        }
    }

    @Override // defpackage.rh4
    public final rh4 add(na2 na2Var, long j) {
        String str = na2Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    public final uf3 b(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        i.m("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // defpackage.rh4
    public final rh4 add(na2 na2Var, Object obj) {
        b(obj, na2Var.a);
        return this;
    }

    @Override // defpackage.mk7
    public final mk7 add(String str) {
        c();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.mk7
    public final mk7 add(boolean z) {
        c();
        this.b.value(z);
        return this;
    }
}
