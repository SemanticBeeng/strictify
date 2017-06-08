// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.example.protocol.employee



/** @param id
  *   logically required (beware, ScalaPb sets default value to Zero)
  * @param name
  *   logically required, non-empty
  *   beware: ScalaPb sets default value to empty string
  *   However, our Refined types in the crossponding model should catch this.
  * @param age
  *   logically optional, Postive (using Google wrapper to allow optional)
  */
@SerialVersionUID(0L)
final case class EmployeeData(
    id: Int = 0,
    name: String = "",
    age: scala.Option[Int] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EmployeeData] with com.trueaccord.lenses.Updatable[EmployeeData] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (id != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, id) }
      if (name != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, name) }
      if (age.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(com.example.protocol.employee.EmployeeData._typemapper_age.toBase(age.get).serializedSize) + com.example.protocol.employee.EmployeeData._typemapper_age.toBase(age.get).serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = id
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      age.foreach { __v =>
        _output__.writeTag(20, 2)
        _output__.writeUInt32NoTag(com.example.protocol.employee.EmployeeData._typemapper_age.toBase(__v).serializedSize)
        com.example.protocol.employee.EmployeeData._typemapper_age.toBase(__v).writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.example.protocol.employee.EmployeeData = {
      var __id = this.id
      var __name = this.name
      var __age = this.age
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __id = _input__.readInt32()
          case 18 =>
            __name = _input__.readString()
          case 162 =>
            __age = Some(com.example.protocol.employee.EmployeeData._typemapper_age.toCustom(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __age.map(com.example.protocol.employee.EmployeeData._typemapper_age.toBase(_)).getOrElse(com.google.protobuf.wrappers.Int32Value.defaultInstance))))
          case tag => _input__.skipField(tag)
        }
      }
      com.example.protocol.employee.EmployeeData(
          id = __id,
          name = __name,
          age = __age
      )
    }
    def withId(__v: Int): EmployeeData = copy(id = __v)
    def withName(__v: String): EmployeeData = copy(name = __v)
    def getAge: Int = age.getOrElse(com.example.protocol.employee.EmployeeData._typemapper_age.toCustom(com.google.protobuf.wrappers.Int32Value.defaultInstance))
    def clearAge: EmployeeData = copy(age = None)
    def withAge(__v: Int): EmployeeData = copy(age = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = id
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 20 => age.map(com.example.protocol.employee.EmployeeData._typemapper_age.toBase(_)).orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(id)
        case 2 => _root_.scalapb.descriptors.PString(name)
        case 20 => age.map(com.example.protocol.employee.EmployeeData._typemapper_age.toBase(_).toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.example.protocol.employee.EmployeeData
}

object EmployeeData extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.example.protocol.employee.EmployeeData] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.example.protocol.employee.EmployeeData] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.example.protocol.employee.EmployeeData = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.example.protocol.employee.EmployeeData(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[String],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.wrappers.Int32Value]].map(com.example.protocol.employee.EmployeeData._typemapper_age.toCustom(_))
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.example.protocol.employee.EmployeeData] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.example.protocol.employee.EmployeeData(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(20).get).flatMap(_.as[scala.Option[com.google.protobuf.wrappers.Int32Value]]).map(com.example.protocol.employee.EmployeeData._typemapper_age.toCustom(_))
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EmployeeProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EmployeeProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 20 => __out = com.google.protobuf.wrappers.Int32Value
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.example.protocol.employee.EmployeeData(
  )
  implicit class EmployeeDataLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.example.protocol.employee.EmployeeData]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.example.protocol.employee.EmployeeData](_l) {
    def id: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def age: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getAge)((c_, f_) => c_.copy(age = Some(f_)))
    def optionalAge: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.age)((c_, f_) => c_.copy(age = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
  final val AGE_FIELD_NUMBER = 20
  @transient
  private val _typemapper_age: _root_.com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.Int32Value, Int] = implicitly[_root_.com.trueaccord.scalapb.TypeMapper[com.google.protobuf.wrappers.Int32Value, Int]]
}