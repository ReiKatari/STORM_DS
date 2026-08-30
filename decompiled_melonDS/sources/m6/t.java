package m6;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {
    public final Class A;
    public final ArrayList B;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.B = new ArrayList();
        p7.m.l(cls, "watcherClass cannot be null");
        this.A = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i2 < arrayList.size()) {
                ((s) arrayList.get(i2)).B.incrementAndGet();
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i2 < arrayList.size()) {
                ((s) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
                i2++;
            } else {
                return;
            }
        }
    }

    public final s c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i2 < arrayList.size()) {
                s sVar = (s) arrayList.get(i2);
                if (sVar.A == obj) {
                    return sVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.A == obj.getClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i10) {
        super.delete(i2, i10);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i2 < arrayList.size()) {
                ((s) arrayList.get(i2)).B.decrementAndGet();
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i10, Class cls) {
        if (this.A == cls) {
            s[] sVarArr = (s[]) super.getSpans(i2, i10, s.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, sVarArr.length);
            for (int i11 = 0; i11 < sVarArr.length; i11++) {
                objArr[i11] = sVarArr[i11].A;
            }
            return objArr;
        }
        return super.getSpans(i2, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i10, Class cls) {
        return super.nextSpanTransition(i2, i10, (cls == null || this.A == cls) ? s.class : s.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.B.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i2, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i10, int i11) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.B.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i2, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i10) {
        return new t(this.A, this, i2, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i10) {
        super.delete(i2, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i10, int i11) {
        super.insert(i2, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i10, int i11) {
        super.insert(i2, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i10) {
        super.append(charSequence, i2, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i10) {
        super.append(charSequence, i2, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i10) {
        super.append(charSequence, i2, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i2, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i10, CharSequence charSequence) {
        a();
        super.replace(i2, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i10, CharSequence charSequence) {
        replace(i2, i10, charSequence);
        return this;
    }

    public t(Class cls, t tVar, int i2, int i10) {
        super(tVar, i2, i10);
        this.B = new ArrayList();
        p7.m.l(cls, "watcherClass cannot be null");
        this.A = cls;
    }
}
