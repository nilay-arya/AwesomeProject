import {NativeModules} from 'react-native';
const {drakeManager} = NativeModules;

function drakeFunc() {
  return drakeManager.navigateToExample();
}

module.exports = drakeFunc